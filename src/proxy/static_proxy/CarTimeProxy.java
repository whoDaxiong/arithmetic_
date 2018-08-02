package proxy.static_proxy;

/**
 * 静态代理，聚合方式，实现记录汽车行驶的时间
 */
public class CarTimeProxy implements Moveable {
    private Moveable move;

    public CarTimeProxy(Moveable move) {
        super();
        this.move = move;
    }


    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        System.out.println("car runtime begin..");
        move.move();
        long endTime = System.currentTimeMillis();
        System.out.println("car running :"+(endTime-startTime)+"ms");
    }
}
