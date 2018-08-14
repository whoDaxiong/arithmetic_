package observer.weatherObserver;

public class Test {
    public static void main(String[] args) {
        //创建目标
        ConcreteWeatherSubject weather = new ConcreteWeatherSubject();
        //创建观察者
        ConcreteObserver observerGirl = new ConcreteObserver();
        observerGirl.setObserverName("女朋友");
        observerGirl.setRemindThing("第一次约会，不见不散");

        ConcreteObserver observerMum = new ConcreteObserver();
        observerMum.setObserverName("老妈");
        observerMum.setRemindThing("逛街");
        //注册观察者
        weather.attach(observerGirl);
        weather.attach(observerMum);
        //目标发布天气
        weather.setWeatherContent("明天天气晴朗，28°");
    }
}
