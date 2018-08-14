package proxy.dynamic_proxy;

import proxy.static_proxy.Car;
import proxy.static_proxy.Moveable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String arg[]) {
        Car car = new Car();
        InvocationHandler timeHandler = new TimeHandler(car);
        Class<? extends Car> carClass = car.getClass();
        /**
         * 1.   类加载器
         * 2.   实现的接口
         * 3.    invocationHandler
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
                method.invoke(car,args);
                return null;
            }
        });
        carMusic.move();

    }
}
