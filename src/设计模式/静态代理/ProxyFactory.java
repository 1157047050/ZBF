package 设计模式.静态代理;

public class ProxyFactory {
    public static ILawSuit getProxy(){
        return new ProxyLawyer(new SecondDogWang());
    }
}
