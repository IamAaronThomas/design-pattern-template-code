package observer.pattern;

import java.util.Observable;

/**
 * 被观察的对象
 */
public class WeatherData extends Observable {
    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;
    /**
     * 气压
     */
    private float pressure;

    public WeatherData() {
    }

    public void measurementsChanged() {
        //  先调用setChanged 表示观察状态已经改变
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    /**
     * 通过使用“拉”的方式，取得被观察对象的状态
     * 但是：“推”才是最佳使用方式
     */
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
