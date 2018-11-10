package 线程池;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<Runnable> arrayBlockingQueue = new ArrayBlockingQueue<Runnable>(2);
        ArrayBlockingQueue<Runnable> aaa = new ArrayBlockingQueue<Runnable>(200);
        MyRejected mj = new MyRejected(aaa);
        //1.核心线程数 2.最大线程数 3.超过核心线程数的线程存活的时间 4.存活时间的单位 5.工作队列 6.
        ThreadPoolExecutor testThreadPool = new ThreadPoolExecutor(2,2,50,TimeUnit.SECONDS,arrayBlockingQueue,mj);
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        testThreadPool.execute(new MyPool());
        while (!aaa.isEmpty()) {
            System.out.println("--=处理异常==");
            aaa.take().run();
        }
    }
}
