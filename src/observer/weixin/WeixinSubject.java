package observer.weixin;

import java.util.Observable;

public class WeixinSubject extends Observable {
    private String content;//文章

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        setChanged();
        notifyObservers();
    }
}
