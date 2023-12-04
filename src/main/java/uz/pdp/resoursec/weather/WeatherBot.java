package uz.pdp.resoursec.weather;

import com.google.gson.Gson;
import lombok.SneakyThrows;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Locale;
public class WeatherBot {
    private static final String API_KEY = "c6fadf99bfac3ce6afc905f0a46c96f8";

    @SneakyThrows
    public static String humidity(String location) {
        // Ob-havo ma'lumotlarini olish uchun API URL
        String apiUrl = "http://api.openweathermap.org/data/2.5/weather?q=" + location + "&appid=" + API_KEY;

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(new URL(apiUrl).openStream()));

        WeatherData weatherData = new Gson().fromJson(reader, WeatherData.class);

        double temperature = weatherData.getMain().getTemp() - 273.15; // Kelvin dan Celsius ga o'tkazish
        double humidity = weatherData.getMain().getHumidity();
        return "Location : " + location.toUpperCase(Locale.ROOT) + "\n" + "Temperatura : " + temperature +
                " °C" + "\n" + "Namlik : " + humidity + " %";

    }
}