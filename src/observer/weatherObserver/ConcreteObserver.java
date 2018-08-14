package observer.weatherObserver;

import observer.ConcreteSubject;
import observer.Subject;

/**
 * 具体的观察者对象，实现更新的方法，使自身状态和目标状态一致
 */
public class ConcreteObserver implements Observer {
    //观察者的名称
    private String observerName;
    //天气内容，从目标处获取
    private String weatherContent;
    //提醒内容
    private String remindThing;

    /**
     * 获取目标类的状态同步到观察者的状态中
     * @param subject 传入目标对象，方便获取相应的目标对象的状态
     */
    @Override
    public void update(WeatherSubject subject) {
        weatherContent = ((ConcreteWeatherSubject)subject).getWeatherContent();
        System.out.println(observerName+"收到"+weatherContent+","+remindThing);
    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
    }

    public String getRemindThing() {
        return remindThing;
    }

    public void setRemindThing(String remindThing) {
        this.remindThing = remindThing;
    }
}
