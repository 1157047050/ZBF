package 线程池;

public class MyPool implements Runnable {
    @Override
    public void run() {
        /*try {
            System.out.println("====当前线程===="+Thread.currentThread().getId());
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println("====当前线程===="+Thread.currentThread().getId());
    }
}
