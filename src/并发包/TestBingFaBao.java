package 并发包;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class TestBingFaBao {
    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
        /*CountDownLatch countDownLatch = new CountDownLatch(3);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
        Semaphore semaphore = new Semaphore(3);

        Thread t1 = new Thread(new MyRunable5(countDownLatch),"A");
        t1.start();
        Thread t2 = new Thread(new MyRunable5(countDownLatch),"B");
        t2.start();
        Thread t3 = new Thread(new MyRunable5(countDownLatch),"B");
        t3.start();
        countDownLatch.await();
        System.out.println("======================");*/





        CyclicBarrier cyclicBarrier = new CyclicBarrier(2, new Runnable() {
            @Override
            public void run() {
                System.out.println("这个要最后打印");
            }
        });
        Thread t1 = new Thread(new MyCycRunable(cyclicBarrier),"C");
        t1.start();
        Thread t2 = new Thread(new MyCycRunable(cyclicBarrier),"D");
        t2.start();
        cyclicBarrier.await();
        System.out.println("======================");


       /* Semaphore semaphore = new Semaphore(3);
        Thread t1 = new Thread(new MySemRunable(semaphore),"C");
        t1.start();
        Thread t2 = new Thread(new MySemRunable(semaphore),"D");
        t2.start();
        Thread t3 = new Thread(new MySemRunable(semaphore),"E");
        t3.start();
        Thread t4 = new Thread(new MySemRunable(semaphore),"F");
        t4.start();*/

    }
}
