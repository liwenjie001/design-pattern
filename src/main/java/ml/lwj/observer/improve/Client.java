package ml.lwj.observer.improve;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        // 创建观察者
        CurrentConditions currentConditions = new CurrentConditions();
        BaiduSite baiduSite = new BaiduSite();
        // 注册到 weatherData
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baiduSite);
        weatherData.setData(10,23,23);

    }
}
