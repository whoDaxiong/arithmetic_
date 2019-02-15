package proxy.dynamic_proxy;

public class Phone implements Call {
    @Override
    public void call() {
        System.out.println("call all");
    }
}
