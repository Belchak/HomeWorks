package WeatherForecasat;

import WeatherForecasat.Days;
import WeatherForecasat.Temperature;
import WeatherForecasat.Weather_;

public class main {
    public static void main (String... args) {
        Weather_ weather = new Weather_();
        Days days = new Days();

        Temperature temp = new Temperature();

        System.out.println("Today " + days.mon + temp.el + weather.sun + weather.clo);

    }
}
