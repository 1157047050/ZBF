package 线程池.应用举例;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestExcutors{
    private ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);

    public void tryConnection(final Long startTime){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                //尝试连接

                //如果失败尝试重连
                if (System.currentTimeMillis()-startTime>=60000){
                    scheduledExecutorService.shutdownNow();
                    return;
                }
                System.out.println("正在尝试连接!!!");
            }
        };
        scheduledExecutorService.scheduleAtFixedRate(runnable,0,5,TimeUnit.SECONDS);
    }
}
