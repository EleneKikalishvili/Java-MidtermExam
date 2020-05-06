package elene.kikalishvili.weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherRepo {
    public static List<Weather> getWeather(){
        List<Weather> weatherList = new ArrayList<>();
        weatherList.add(new Weather("EAST", 20, "Tbilisi", 70, 20, 15));
        weatherList.add(new Weather("WEST", 20, "Batumi", 72, 25, 11));
        weatherList.add(new Weather("EAST", 20, "Kutaisi", 71, 22, 12));
        return weatherList;

    }
}