package proxy.static_proxy;

public class Test {
    public static void main(String arg[]) {
        Car car = new Car();
        CarLogProxy carLog = new CarLogProxy(car);
        CarTimeProxy carTime = new CarTimeProxy(carLog);
        carTime.move();
    }
}
