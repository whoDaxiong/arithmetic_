package observer.jdk_observer;

import java.util.Observable;

//天气目标的具体实现
public class ConcreteWeatherSubject extends Observable {
    //天气的具体内容
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        //通知所有观察者
        this.setChanged();
        //推模式
        this.notifyObservers(content);
        //拉模式(传递自身引用)
        //this.notifyObservers();
    }
}
