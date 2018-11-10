package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UserTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<User> c = User.class;
         Constructor[] constructors = c.getConstructors();
         User user = c.newInstance();
         Method[] methods = c.getDeclaredMethods();
        for (Method method:methods) {
            String stat = method.getName();
            if (stat.startsWith("set")){
                System.out.println("====设置值=====");
                method.invoke(user,"6666666666666666666");
            }else if (stat.startsWith("get")){
                System.out.println("=====读取值====");
                System.out.println("=====读取到的值===="+method.invoke(user));
            }else {
                method.setAccessible(true);
                method.invoke(user);
            }
        }
        System.out.println("------------------------"+user);
    }
}
