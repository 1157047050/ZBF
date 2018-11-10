package 设计模式.JDK动态代理;

public class TestInterfaceImpl implements TestInterface{

    @Override
    public String test(String tests) {
        System.out.println("=====执行本方法======="+tests);
        return "--返回值--";
    }
}
