package observer.sp_weather;

public class ConcreteWeatherSubject extends WeatherSubject{
    //目标对象的状态
    private String weatherContent;

    @Override
    protected void notifyObservers() {
        //循环所有观察者
        for (Observer observer : observers) {
            //设置条件
            if (weatherContent.equals("rain")) {
                if (observer.getObserverName().equals("girl")) {
                    observer.update(this);
                }
                if (observer.getObserverName().equals("mum")) {
                    observer.update(this);
                }
            }
            if (weatherContent.equals("sun")) {
                if (observer.getObserverName().equals("mum")) {
                    observer.update(this);
                }
            }

        }
    }

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        this.notifyObservers();
    }
}
