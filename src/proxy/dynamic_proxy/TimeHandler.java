package proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类继承事务处理器
 * 时间动态代理类
 */
public class TimeHandler implements InvocationHandler{
    private Object target;

    TimeHandler(Object target) {
        super();
        this.target = target;
    }

    /**
     *
     * @param proxy     被代理的对象
     * @param method    被代理对象的方法
     * @param args      方法的参数
     * @return Object   方法的返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("car runtime begin..");

        //原始方法
        method.invoke(target);

        long endTime = System.currentTimeMillis();
        System.out.println("car running :"+(endTime-startTime)+"ms");
        return null;
    }
}
