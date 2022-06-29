package com.amit.works.test_runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"com.amit.works.step_definitions"},
        plugin = {"pretty",
                "html:target/cucumber-html/cucumber.html",
                "json:target/cucumber-json/cucumber.json"}
)
//        tags = "@run1")


public class TestRunner1 {

}
