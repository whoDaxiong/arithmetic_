package observer.weixin;

import java.util.Observable;
import java.util.Observer;

public class WeixinObserver implements Observer {
    private String observerName;//订阅者名称
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(observerName+"has a message:"+((WeixinSubject)o).getContent());
    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }
}
