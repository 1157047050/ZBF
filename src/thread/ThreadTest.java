package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
       /* Thread t1 = new Thread(){
            @Override
            public void run() {
                System.out.println("================");
            }
        };
        t1.start();

        Thread t2 = new Thread(new MyRunable());
        t2.start();


        FutureTask<String> task = new FutureTask<String>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "66666666666";
            }
        });
        Thread t3 = new Thread(task);
        t3.start();
        System.out.println(task.get());*/


        /*List<String> list=new ArrayList<String>();
        Thread t11 = new Thread(new MyRunable2(list));
        t11.start();
        Thread t12 = new Thread(new MyRunable2(list));
        t12.start();
        t11.join();
        t12.join();
        System.out.println("============>"+list.size());*/



        List<String> list=new ArrayList<String>();
        Lock lock = new ReentrantLock();
        Thread t11 = new Thread(new MyRunable3(lock,list));
        t11.start();
        Thread t12 = new Thread(new MyRunable3(lock,list));
        t12.start();
        t11.join();
        t12.join();
        System.out.println("============>"+list.size());
    }
}
