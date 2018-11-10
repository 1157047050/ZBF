package 单例模式;
//懒汉式
public class Test2 {
    private static Test2 test2;

    public Test2() {

    }

    public static synchronized Test2 getTest2() {
        if(test2==null){
            test2=new Test2();
        }
        return test2;
    }
}
