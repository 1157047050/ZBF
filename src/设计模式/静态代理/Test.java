package 设计模式.静态代理;

import sun.net.www.content.text.plain;

public class Test {
    public static void main(String[] args) {
        ProxyFactory.getProxy().submit("工资流水在此");
        ProxyFactory.getProxy().defend();
    }
}
