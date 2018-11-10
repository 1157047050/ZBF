package 设计模式.JDK动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocation implements InvocationHandler {
    private Object object;

    public MyInvocation(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("=====执行之前添加的功能========");
        Object o=method.invoke(object,args);
        System.out.println("=====执行之后添加的功能========");
        return o;
    }
}
