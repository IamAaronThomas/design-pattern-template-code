package observer.pattern;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        //  建立显示温度观察者
        CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
        //  建立温度最大最小平均值观察者
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        //  建立预报观察者
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        //  被观察者weatherData的数据发生变化
        //  每变化一次，3个观察者观察到的结果就发生对应改变
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("\n");

        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("\n");

        weatherData.setMeasurements(78, 90, 29.2f);
        System.out.println("\n");
    }
}
