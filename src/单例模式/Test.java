package 单例模式;

public class Test {
    private static Test test = new Test();

    private Test() {
    }

    public static Test getTest() {
        return test;
    }

    public static void setTest(Test test) {
        Test.test = test;
    }
    public void aVoid(){
        System.out.println("hello word");
    }
}
