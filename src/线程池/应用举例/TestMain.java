package 线程池.应用举例;


public class TestMain {
    public static void main(String[] args) {
        TestExcutors testExcutors = new TestExcutors();
        testExcutors.tryConnection(System.currentTimeMillis());
    }
}
