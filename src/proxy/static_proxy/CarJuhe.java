package proxy.static_proxy;

public class CarJuhe implements Moveable {
    private Car car;

    public CarJuhe(Car car) {
        super();
        this.car = car;
    }

    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        car.move();
        long endTime = System.currentTimeMillis();
        System.out.println("car:"+(endTime-startTime)+"hm");
    }
}
