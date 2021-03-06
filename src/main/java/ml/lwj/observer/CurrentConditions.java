package ml.lwj.observer;

/**
 * 显示当前天气情况（可以理解成是气象站自己的网站）
 */
public class CurrentConditions {
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
        System.out.println(" Today mTemperature: " + temperature + "***");
        System.out.println(" Today mPressure: " + pressure + "***");
        System.out.println(" Today mHumidity: " + humidity + "***");
    }

}
