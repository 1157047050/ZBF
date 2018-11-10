package 并发包;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

public class Test2 {
    public static void main(String[] args) throws Exception {
        CountDownLatch countDownLatch = new CountDownLatch(4);
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        FutureTask<List<Map<String,Object>>> ft1 = new FutureTask<List<Map<String,Object>>>(new MyRunable6(countDownLatch,list));
        Thread t1 = new Thread();
        t1.start();
        FutureTask<List<Map<String,Object>>> ft2 = new FutureTask<List<Map<String,Object>>>(new MyRunable6(countDownLatch,list));
        Thread t2 = new Thread();
        t2.start();
        FutureTask<List<Map<String,Object>>> ft3 = new FutureTask<List<Map<String,Object>>>(new MyRunable6(countDownLatch,list));
        Thread t3 = new Thread();
        t3.start();
        FutureTask<List<Map<String,Object>>> ft4 = new FutureTask<List<Map<String,Object>>>(new MyRunable6(countDownLatch,list));
        Thread t4 = new Thread();
        t4.start();
        countDownLatch.await();


        List<Map<String,Object>> l1 = ft1.get();
        List<Map<String,Object>> l2 = ft2.get();
        List<Map<String,Object>> l3 = ft3.get();
        List<Map<String,Object>> l4 = ft4.get();

        list.addAll(l1);
        list.addAll(l2);
        list.addAll(l3);
        list.addAll(l4);


    }
}
