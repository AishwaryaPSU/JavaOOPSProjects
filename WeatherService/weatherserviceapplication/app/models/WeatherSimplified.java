package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherSimplified {
    @JsonProperty("time")
    private String time;
    @JsonProperty("sun_rise")
    private String sunRise;
    @JsonProperty("sun_set")
    private String sunSet;
    @JsonProperty("timezone_name")
    private String timezoneName;
    @JsonProperty("title")
    private String title;

    @Override
    public String toString() {
        return "WeatherSimplified{" +
                "time='" + time + '\'' +
                ", sunRise='" + sunRise + '\'' +
                ", sunSet='" + sunSet + '\'' +
                ", timezoneName='" + timezoneName + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSunRise() {
        return sunRise;
    }

    public void setSunRise(String sunRise) {
        this.sunRise = sunRise;
    }

    public String getSunSet() {
        return sunSet;
    }

    public void setSunSet(String sunSet) {
        this.sunSet = sunSet;
    }

    public String getTimezoneName() {
        return timezoneName;
    }

    public void setTimezoneName(String timezoneName) {
        this.timezoneName = timezoneName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
