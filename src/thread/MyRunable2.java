package thread;


import java.util.List;

public class MyRunable2 implements Runnable{
    private List<String> list;

    public MyRunable2(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i=0;i<2000;i++) {
            //
           /* synchronized (list){
                list();
            }*/
            list.add(""+1);
        }
    }
    /*public synchronized void list(){
        list.add(""+1);
    }*/
}
