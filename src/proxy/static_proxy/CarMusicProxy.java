package proxy.static_proxy;

public class CarMusicProxy implements Moveable{
    private Moveable moveable;

    public CarMusicProxy(Moveable moveable) {
        super();
        this.moveable = moveable;
    }

    @Override
    public void move() {
        System.out.println("open music");
        moveable.move();//被代理对象的原始方法
    }
}
