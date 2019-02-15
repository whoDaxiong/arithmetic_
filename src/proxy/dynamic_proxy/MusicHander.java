package proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MusicHander implements InvocationHandler {
    private Object target;

    MusicHander(Object target) {
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("open music");
        method.invoke(target);
        System.out.println("close music");
        return null;
    }
}
