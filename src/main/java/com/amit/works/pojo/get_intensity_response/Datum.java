package com.amit.works.pojo.get_intensity_response;


import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

public class Datum {

    @JsonProperty("from")
    private String from;
    @JsonProperty("to")
    private String to;
    @JsonProperty("intensity")
    private Intensity intensity;

    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    @JsonProperty("intensity")
    public Intensity getIntensity() {
        return intensity;
    }

    @JsonProperty("intensity")
    public void setIntensity(Intensity intensity) {
        this.intensity = intensity;
    }

}
