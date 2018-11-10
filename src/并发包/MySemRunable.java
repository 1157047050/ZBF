package 并发包;

import java.util.concurrent.Semaphore;

public class MySemRunable implements Runnable {
    private Semaphore semaphore;

    public MySemRunable(Semaphore semaphore) {
        this.semaphore = semaphore;
    }
    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println("当前线程--"+Thread.currentThread().getName()+"---获得资源的使用权---");
            for (int i=0;i<20;i++){
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("当前线程--"+Thread.currentThread().getName()+"---释放获得的资源---");
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
