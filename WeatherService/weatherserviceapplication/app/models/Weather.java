package models;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "weather_state_name",
        "weather_state_abbr",
        "wind_direction_compass",
        "created",
        "applicable_date",
        "min_temp",
        "max_temp",
        "the_temp",
        "wind_speed",
        "wind_direction",
        "air_pressure",
        "humidity",
        "visibility",
        "predictability"
})
public class Weather {

    @JsonProperty("id")
    private int id;
    @JsonProperty("weather_state_name")
    private String weatherStateName;
    @JsonProperty("weather_state_abbr")
    private String weatherStateAbbr;
    @JsonProperty("wind_direction_compass")
    private String windDirectionCompass;
    @JsonProperty("created")
    private String created;
    @JsonProperty("applicable_date")
    private String applicableDate;
    @JsonProperty("min_temp")
    private double minTemp;
    @JsonProperty("max_temp")
    private double maxTemp;
    @JsonProperty("the_temp")
    private double theTemp;
    @JsonProperty("wind_speed")
    private double windSpeed;
    @JsonProperty("wind_direction")
    private int windDirection;
    @JsonProperty("air_pressure")
    private double airPressure;
    @JsonProperty("humidity")
    private int humidity;
    @JsonProperty("visibility")
    private double visibility;
    @JsonProperty("predictability")
    private int predictability;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("weather_state_name")
    public String getWeatherStateName() {
        return weatherStateName;
    }

    @JsonProperty("weather_state_name")
    public void setWeatherStateName(String weatherStateName) {
        this.weatherStateName = weatherStateName;
    }

    @JsonProperty("weather_state_abbr")
    public String getWeatherStateAbbr() {
        return weatherStateAbbr;
    }

    @JsonProperty("weather_state_abbr")
    public void setWeatherStateAbbr(String weatherStateAbbr) {
        this.weatherStateAbbr = weatherStateAbbr;
    }

    @JsonProperty("wind_direction_compass")
    public String getWindDirectionCompass() {
        return windDirectionCompass;
    }

    @JsonProperty("wind_direction_compass")
    public void setWindDirectionCompass(String windDirectionCompass) {
        this.windDirectionCompass = windDirectionCompass;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("applicable_date")
    public String getApplicableDate() {
        return applicableDate;
    }

    @JsonProperty("applicable_date")
    public void setApplicableDate(String applicableDate) {
        this.applicableDate = applicableDate;
    }

    @JsonProperty("min_temp")
    public double getMinTemp() {
        return minTemp;
    }

    @JsonProperty("min_temp")
    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    @JsonProperty("max_temp")
    public double getMaxTemp() {
        return maxTemp;
    }

    @JsonProperty("max_temp")
    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    @JsonProperty("the_temp")
    public double getTheTemp() {
        return theTemp;
    }

    @JsonProperty("the_temp")
    public void setTheTemp(double theTemp) {
        this.theTemp = theTemp;
    }

    @JsonProperty("wind_speed")
    public double getWindSpeed() {
        return windSpeed;
    }

    @JsonProperty("wind_speed")
    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    @JsonProperty("wind_direction")
    public int getWindDirection() {
        return windDirection;
    }

    @JsonProperty("wind_direction")
    public void setWindDirection(int windDirection) {
        this.windDirection = windDirection;
    }

    @JsonProperty("air_pressure")
    public double getAirPressure() {
        return airPressure;
    }

    @JsonProperty("air_pressure")
    public void setAirPressure(double airPressure) {
        this.airPressure = airPressure;
    }

    @JsonProperty("humidity")
    public int getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("visibility")
    public double getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(double visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("predictability")
    public int getPredictability() {
        return predictability;
    }

    @JsonProperty("predictability")
    public void setPredictability(int predictability) {
        this.predictability = predictability;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

