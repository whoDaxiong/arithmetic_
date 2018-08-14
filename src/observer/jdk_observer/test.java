package observer.jdk_observer;

public class test {
    public static void main(String[] args) {
        //创建天气作为目标（被观察者）
        ConcreteWeatherSubject subject = new ConcreteWeatherSubject();
        //创建观察者
        ConcreteObserver girl = new ConcreteObserver();
        girl.setObserverName("girl");
        ConcreteObserver mum = new ConcreteObserver();
        mum.setObserverName("mum");

        //注册观察者
        subject.addObserver(girl);
        subject.addObserver(mum);

        //目标更新天气情况
        subject.setContent("rain");

    }
}
