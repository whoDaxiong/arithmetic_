package proxy.static_proxy;

import java.util.Random;

/**
 * 车对象
 */
public class Car implements Moveable {

    //实现开车
    @Override
    public void move() {
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println("car driver...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
