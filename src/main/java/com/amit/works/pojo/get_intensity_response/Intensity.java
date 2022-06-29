package com.amit.works.pojo.get_intensity_response;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Intensity {

    @JsonProperty("forecast")
    private int forecast;
    @JsonProperty("actual")
    private int actual;
    @JsonProperty("index")
    private String index;

    @JsonProperty("forecast")
    public int getForecast() {
        return forecast;
    }

    @JsonProperty("forecast")
    public void setForecast(int forecast) {
        this.forecast = forecast;
    }

    @JsonProperty("actual")
    public int getActual() {
        return actual;
    }

    @JsonProperty("actual")
    public void setActual(int actual) {
        this.actual = actual;
    }

    @JsonProperty("index")
    public String getIndex() {
        return index;
    }

    @JsonProperty("index")
    public void setIndex(String index) {
        this.index = index;
    }

}
