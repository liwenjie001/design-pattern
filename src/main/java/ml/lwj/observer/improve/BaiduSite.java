package ml.lwj.observer.improve;

public class BaiduSite implements Observer{
    private float temperature;
    private float pressure;
    private float humidity;
    // 更新天气情况，是由WeatherData 来调用
    public void update(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    private void display() {
        System.out.println(" baidu mTemperature: " + temperature + "***");
        System.out.println(" baidu mPressure: " + pressure + "***");
        System.out.println(" baidu mHumidity: " + humidity + "***");
    }
}
