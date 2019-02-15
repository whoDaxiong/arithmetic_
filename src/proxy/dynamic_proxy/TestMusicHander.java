package proxy.dynamic_proxy;

import java.lang.reflect.Proxy;

public class TestMusicHander {
    public static void main(String arg[]) {
        Phone phone = new Phone();
        MusicHander musicHander = new MusicHander(phone);
        Class<? extends Phone> aClass = phone.getClass();

        Call proxyInstance = (Call) Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), musicHander);
        proxyInstance.call();
    }
}
