package ml.lwj.observer;

/**
 * 是核心类
 * 1. 包含最新的天气情况信息
 *
 * 2. 含有currentConditions
 *
 * 3. 当数据有更新的时候就调用 currentConditions.update 方法;
 */
public class WeatherData {
    private float temperatrue;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    public float getTemperatrue() {
        return temperatrue;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange(){
        // 调用接入方的 update
        currentConditions.update(getTemperatrue(),getPressure(),getHumidity());
    }

    // 当数据有更新时，就调用setData方法
    public void setData(float temperatrue,float pressure,float humidity){
        this.temperatrue = temperatrue;
        this.pressure = pressure;
        this.humidity = humidity;
        // 将最新的信息推送给接入方 currentConditions
        dataChange();
    }
}
