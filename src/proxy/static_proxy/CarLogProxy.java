package proxy.static_proxy;

/**
 * 静态代理，聚合方式，实现记录汽车行驶的日志信息
 */
public class CarLogProxy implements Moveable {
    private Moveable move;

    public CarLogProxy(Moveable move) {
        super();
        this.move = move;
    }


    @Override
    public void move() {
        System.out.println("log start..");
        move.move();
        System.out.println("log end...");
    }
}
