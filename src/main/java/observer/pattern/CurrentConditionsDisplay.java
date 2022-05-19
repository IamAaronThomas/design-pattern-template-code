package observer.pattern;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 * 被观察对象发生变化后，在这里显示
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        //  将CurrentConditionsDisplay登记成观察者
        observable.addObserver(this);
    }

    /**
     * @param observable 被观察的对象
     * @param arg        an argument passed to the <code>notifyObservers</code>
     *                   method.
     */
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    public void display() {
        System.out.println("显示当前观察到的数据 温度: " + temperature
                + " ,湿度: " + humidity + " ,气压: " + pressure);
    }
}
