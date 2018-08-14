package observer.sp_weather;

/**
 * 观察者接口，定义一个update方法
 */
public interface Observer {
    //提供更新
    void update(WeatherSubject subject);

    //设置观察者名称
    void setObserverName(String name);

    //获取观察者名称
    String getObserverName();
}
