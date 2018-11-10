package 设计模式.JDK动态代理;


import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        TestInterface tf=new TestInterfaceImpl();
        TestInterface tif=(TestInterface)Proxy.newProxyInstance(MyInvocation.class.getClassLoader(), TestInterfaceImpl.class.getInterfaces(), new MyInvocation(tf));
        System.out.println("????"+tif.test("........."));
    }
}
