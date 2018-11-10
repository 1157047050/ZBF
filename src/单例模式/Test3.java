package 单例模式;
//饿汉式
public class Test3 {
    private static final Test3 test3 = new Test3();

    public Test3() {

    }
    public static Test3 getTest3() {
        return test3;
    }
}
