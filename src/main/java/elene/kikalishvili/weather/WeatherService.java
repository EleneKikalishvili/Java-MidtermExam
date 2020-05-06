package elene.kikalishvili.weather;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

import static elene.kikalishvili.weather.WeatherRepo.getWeather;

@Path("/weather")
public class WeatherService {
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Weather> weatherList(){
        return getWeather();
    }

    @GET
    @Path("/{city}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Weather> weatherList(@PathParam("city") String city) {
        ArrayList cityWeather = new ArrayList();
        for(Weather i: weatherList()) {
            if(i.getCity().equals(city)){
                cityWeather.add(i);
            }
        }
        return cityWeather;
    }
}
