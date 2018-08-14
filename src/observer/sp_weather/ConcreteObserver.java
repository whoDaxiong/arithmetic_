package observer.sp_weather;

public class ConcreteObserver implements Observer {
    //观察者名称
    private String observerName;
    //天气情况
    private String weatherContent;
    //提醒的内容
    private String remindThing;
    @Override
    public void update(WeatherSubject subject) {
        weatherContent = ((ConcreteWeatherSubject)subject).getWeatherContent();
        System.out.println(observerName+"has a message: "+weatherContent+","+remindThing);
    }

    @Override
    public void setObserverName(String name) {
        observerName = name;
    }

    @Override
    public String getObserverName() {
        return observerName;
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
