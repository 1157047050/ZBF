package 并发包;



import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;

public class MyRunable5 implements Runnable{
    private CountDownLatch countDownLatch;

    public MyRunable5(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        for (int i=0;i<20;i++){
            System.out.println("当前线程--"+Thread.currentThread().getName()+"------"+i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("当前线程--"+Thread.currentThread().getName()+"结束了");
        countDownLatch.countDown();
    }
}
