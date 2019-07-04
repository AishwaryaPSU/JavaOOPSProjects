package services.impl;

import models.WeatherSimplified;
import services.WeatherService;

public class MetaWeatherService implements WeatherService{
    private static final String HOST="https://www.metaweather.com/";
    @Override
    public WeatherSimplified getWeather(String locationId) {
        String url = HOST+"api/location/"+locationId;
        return null;
    }
}
