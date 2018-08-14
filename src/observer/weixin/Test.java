package observer.weixin;

public class Test {
    public static void main(String[] args) {
        // 开通微信公众号
        WeixinSubject weixinSubject = new WeixinSubject();
        // 关注公众号
        WeixinObserver observer1 = new WeixinObserver();
        observer1.setObserverName("xyg");
        WeixinObserver observer2 = new WeixinObserver();
        observer2.setObserverName("zss");

        weixinSubject.addObserver(observer1);
        weixinSubject.addObserver(observer2);
        // 公众号发布新文章
        weixinSubject.setContent("has a now message!");

    }
}
