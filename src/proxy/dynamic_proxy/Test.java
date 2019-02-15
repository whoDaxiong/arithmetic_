package proxy.dynamic_proxy;

import proxy.static_proxy.Car;
import proxy.static_proxy.Moveable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理：对不同类、不同方法的代理
 *
 * 实现方式：  1.jdk动态代理：
 *              A:创建事务处理器(java.lang.reflect.InvocationHandler)，实现invoke方法(对原始对象增加功能)
 *              B:创建被代理的类及接口
 *              C:调用Proxy.newProxyInstance方法创建一个代理类
 *           2.cglib动态代理
 */
public class Test {
    public static void main(String arg[]) {
        Car car = new Car();
        InvocationHandler timeHandler = new TimeHandler(car);
        Class<? extends Car> carClass = car.getClass();
        /**
         * 1.   类加载器
         * 2.   实现的接口
         * 3.   事务处理器（实现InvocationHandler接口）
         */
        Moveable moveable = (Moveable) Proxy.newProxyInstance(carClass.getClassLoader(), carClass.getInterfaces(), timeHandler);
        //moveable.move();

        //日志后时间
        Moveable carLog = (Moveable) Proxy.newProxyInstance(carClass.getClassLoader(), carClass.getInterfaces(), new LogHandler(moveable));
        //carLog.move();

        Moveable carMusic = (Moveable) Proxy.newProxyInstance(car.getClass().getClassLoader(), car.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("open music");
                method.invoke(car);
                return null;
            }
        });
        carMusic.move();

    }
}
