package observer.sp_weather;

import java.util.ArrayList;
import java.util.List;

public abstract class WeatherSubject {
    //用来保存注册的观察者对象
    public List<Observer> observers = new ArrayList<>();

    public void attach(Observer oberver) {
        observers.add(oberver);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    protected abstract void notifyObservers();
}
