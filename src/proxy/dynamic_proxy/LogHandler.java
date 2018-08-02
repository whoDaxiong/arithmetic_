package proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 日志代理
 */
public class LogHandler implements InvocationHandler{
    private Object target;

    public LogHandler(Object target) {
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("log begin...");

        method.invoke(target);

        System.out.println("log end..");
        return null;
    }
}
