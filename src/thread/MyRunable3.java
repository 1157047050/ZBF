package thread;



import java.util.List;
import java.util.concurrent.locks.Lock;

public class MyRunable3 implements Runnable{
    private Lock lock;
    private List<String> list;

    public MyRunable3(Lock lock, List<String> list) {
        this.lock = lock;
        this.list = list;
    }

    @Override
    public void run() {
        for (int i=0;i<2000;i++) {
            System.out.println("============="+Thread.currentThread().getId()+"============");
            lock.lock();
            list.add(""+i);
            lock.unlock();
        }
    }
}
