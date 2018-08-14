package proxy.static_proxy;

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
