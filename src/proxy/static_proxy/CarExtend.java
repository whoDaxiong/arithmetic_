package proxy.static_proxy;

/**
 * 继承方式实现静态代理
 */
public class CarExtend extends Car {

    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        //调用父对象的移动方法
        super.move();
        long endTime = System.currentTimeMillis();
        //增加功能
        System.out.println("car:"+(endTime-startTime)+"hm");
    }

    public static void main(String arg[]) {
        CarExtend carExtend = new CarExtend();
        carExtend.move();
    }
}
