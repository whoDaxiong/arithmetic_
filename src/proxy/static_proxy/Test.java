package proxy.static_proxy;
/**
 * 静态代理：代理和被代理对象在代理之前是确定的。他们都实现相同的接口或继承相同的抽象类
 *
 * 分类：1.继承方式：子类调用父类
 *      2.聚合方式：一个类中调用另一个类
 *
 * 优先级：静态代理使用聚合方式更好，原因是继承方式对需求的变更不够灵活
 */

//测试聚合方式的静态代理
public class Test {
    public static void main(String arg[]) {
        Car car = new Car();
        CarTimeProxy carTimeProxy = new CarTimeProxy(car);
        CarMusicProxy carMusicProxy = new CarMusicProxy(carTimeProxy);
        CarLogProxy carLogProxy = new CarLogProxy(carMusicProxy);
        carLogProxy.move();
    }
}
