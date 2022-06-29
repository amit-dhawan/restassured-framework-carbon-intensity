package com.amit.works.pojo.get_intensity_response;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonInclude;
import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "data"
})
public class IntensityResponse {
    @JsonProperty("data")
    private List<Datum> data = null;

    @JsonProperty("data")
    public List<Datum> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Datum> data) {
        this.data = data;
    }
}
