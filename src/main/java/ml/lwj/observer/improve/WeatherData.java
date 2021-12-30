package ml.lwj.observer.improve;


import ml.lwj.observer.CurrentConditions;

import java.util.ArrayList;

/**
 * 是核心类
 * 1. 包含最新的天气情况信息
 *
 * 2. 含有 观察者集合，使用ArrayList管理
 *
 * 3. 当数据有更新的时候就调用 currentConditions.update 方法;
 */
public class WeatherData implements Subject {
    private float temperature;
    private float pressure;
    private float humidity;
    private ArrayList<Observer> observers ;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange(){
        // 调用接入方的 update
        notifyObserver();
    }

    // 当数据有更新时，就调用setData方法
    public void setData(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        // 将最新的信息推送给接入方 currentConditions
        dataChange();
    }
    // 注册一个观察者
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    // 移除一个观察者
    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(0)){
            observers.remove(o);
        }

    }

    // 遍历所有的观察者，并通知
    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this.temperature,this.pressure,this.humidity);
        }
    }
}