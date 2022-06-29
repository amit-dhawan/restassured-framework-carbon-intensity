package com.amit.works.step_definitions;

import com.amit.works.hooks.BeforeHook;
import com.amit.works.pojo.get_intensity_response.IntensityResponse;
import com.amit.works.utils.Utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;


import java.io.File;
import java.io.IOException;
import java.time.*;
import java.time.format.DateTimeFormatter;

import static io.restassured.RestAssured.*;

public class GETIntensityAPI_Steps {

    RequestSpecification requestSpecification;
    Response response;
    IntensityResponse intensityResponseObj;
    String endpoint;

    @Given("I have endpoint for {string} domain")
    public void i_have_endpoint(String domain) throws IOException {
        requestSpecification = Utility.getRequestSpecification(domain);

    }

    @When("I call {string} http method on {string} endpoint")
    public void i_call_http_method_on_this_endpoint(String httpMethod, String endpoint) {
        this.endpoint = endpoint;
        response = given().spec(requestSpecification).when().get(endpoint);
        intensityResponseObj = response.as(IntensityResponse.class);


    }

    @Then("I should get status code as {int}")
    public void i_should_get_status_code_as(int statusCodeExpected) {
        Assert.assertTrue(statusCodeExpected == response.statusCode());
    }

    @Then("Json schema of {string} response is as expected")
    public void json_schema_of_response_of_is_as_expected(String endpoint) {
// validate json schema
        File file = new File("src/test/resources/responseJson/IntensityResponse.json");
        response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(file));

    }

    @Then("Response header is {string} of type {string}")
    public void response_header_is_of_type(String responseHeaderName, String type) {

        Assert.assertTrue("Actual: " + response.header(responseHeaderName).getClass() + "Expected: " + type.getClass(),
                response.header(responseHeaderName).getClass().equals(type.getClass()));
    }

    @Then("Difference in from and to time should be {int} mins")
    public void difference_in_from_and_to_time_should_be_mins(int timeDifference) {
        String from = intensityResponseObj.getData().get(0).getFrom();
        String to = intensityResponseObj.getData().get(0).getTo();

        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2021-11-01T05:06Z", DateTimeFormatter.ISO_INSTANT);
        String time = zonedDateTime.toString();
        System.out.println("from " + from);
        System.out.println("to: " + to);
        System.out.println("current date " + time);


    }


    @Then("I should get {int} carbon intensity object in response")
    public void iShouldGetCarbonIntensityObjectInResponse(int count) {
        Assert.assertTrue("Actual: " + intensityResponseObj.getData().size() +
                        " Expected: " + count,
                intensityResponseObj.getData().size() == count);
    }
}
