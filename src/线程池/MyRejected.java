package 线程池;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class MyRejected implements RejectedExecutionHandler {
    private ArrayBlockingQueue<Runnable> runnables;

    public MyRejected(ArrayBlockingQueue<Runnable> runnables) {
        this.runnables = runnables;
    }

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        runnables.add(r);
       // executor.execute(r);
    }
}
