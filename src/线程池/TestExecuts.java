package 线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestExecuts {
    public static void main(String[] args) {
        //ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
        //开始延时0秒,每2秒一次
        //service.scheduleAtFixedRate(new MyPool(),0,2,TimeUnit.SECONDS);
        //延时2秒一次
         //service.schedule(new MyPool(),2,TimeUnit.SECONDS);
        //可以有多个线程所以有2个ID
        /*ExecutorService es = Executors.newCachedThreadPool();
        es.execute(new MyPool());
        es.execute(new MyPool2());*/
        //只有一个线程所以两个ID一样
        ExecutorService es2 = Executors.newSingleThreadExecutor();
        es2.execute(new MyPool());
        es2.execute(new MyPool2());
    }
}
