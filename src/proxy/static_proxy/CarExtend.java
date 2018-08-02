package proxy.static_proxy;

/**
 * 继承方式实现代理
 *
 * 静态代理：1.继承方式
 *         2.聚合方式
 */
public class CarExtend extends Car {

    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        super.move();
        long endTime = System.currentTimeMillis();
        System.out.println("car:"+(endTime-startTime)+"hm");
    }

    public static void main(String arg[]) {
        CarExtend carExtend = new CarExtend();
        carExtend.move();
    }
}
