package observer.weatherObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，它知道观察它的观察者，并提供注册（添加）和删除观察者的接口
 */
public class WeatherSubject{
    //保存注册的观察者对象
    private List<Observer> observers = new ArrayList<Observer>();

    /**
     * 把订阅天气的人添加到订阅者列表
     * @param observer
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除集合中的指定订阅天气的人
     * @param observer
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有已经订阅天气的人
     */
    protected void notifyObserver(){
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
