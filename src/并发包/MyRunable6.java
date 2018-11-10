package 并发包;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class MyRunable6 implements Callable<List<Map<String,Object>>> {
    private CountDownLatch countDownLatch;

    private List<Map<String,Object>> list;

    public MyRunable6(CountDownLatch countDownLatch, List<Map<String, Object>> list) {
        this.countDownLatch = countDownLatch;
        this.list = list;
    }

    @Override
    public List<Map<String,Object>> call() throws Exception {
        Random random = new Random();
        List<Map<String,Object>> list1 = new ArrayList<>();
        for (Map<String,Object> map:list){
            map.put(""+random.nextInt(10000000),random.nextInt(100000000));
            list1.add(map);
        }
        countDownLatch.countDown();
        return list1;
    }
}
