package elene.kikalishvili.weather;

public class Weather {
    private String windDirection;
    private Integer windSpeed;
    private String city;
    private Integer pressure;
    private  Integer temperature;
    private Integer humidity;


    public Weather() {
    }

    public Weather(String windDirection, Integer windSpeed, String city, Integer pressure, Integer temperature, Integer humidity) {
        this.windDirection = windDirection;
        this.windSpeed = windSpeed;
        this.city = city;
        this.pressure = pressure;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public Integer getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Integer windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "weather{" +
                "windDirection='" + windDirection +
                ", windSpeed=" + windSpeed +
                ", cityName=" + city +
                ", pressure=" + pressure +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }
}