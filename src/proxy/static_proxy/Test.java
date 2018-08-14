package proxy.static_proxy;
/**
 * 继承方式实现代理
 *
 * 静态代理：1.继承方式
 *         2.聚合方式
 */
public class Test {
    public static void main(String arg[]) {
        Car car = new Car();
        CarTimeProxy carTimeProxy = new CarTimeProxy(car);
        CarMusicProxy carMusicProxy = new CarMusicProxy(carTimeProxy);
        CarLogProxy carLogProxy = new CarLogProxy(carMusicProxy);
        carLogProxy.move();
    }
}
