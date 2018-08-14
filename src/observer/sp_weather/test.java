package observer.sp_weather;

public class test {
    public static void main(String[] args) {
        //创建目标
        ConcreteWeatherSubject subject = new ConcreteWeatherSubject();
        //创建观察者
        ConcreteObserver girl = new ConcreteObserver();
        girl.setObserverName("girl");
        girl.setRemindThing("come on");

        ConcreteObserver mum = new ConcreteObserver();
        mum.setObserverName("mum");
        mum.setRemindThing("at home");
        //添加观察者
        subject.attach(girl);
        subject.attach(mum);
        //更新操作
        subject.setWeatherContent("rain");

    }
}
