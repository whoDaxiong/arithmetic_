package observer.jdk_observer;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {
    //观察者名称的变量
    private String observerName;
    /**
     *
     * @param observable  拉方式参数
     * @param object    推方式参数
     */
    @Override
    public void update(Observable observable, Object object) {
        //推方式
        System.out.println(observerName + "has a message,content is " + object);
        //拉方式
        System.out.println(observerName+"has a message,content is"+((ConcreteWeatherSubject)observable).getContent());
    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }
}
