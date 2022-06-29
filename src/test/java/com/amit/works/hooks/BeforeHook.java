package com.amit.works.hooks;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeHook {

   public  static Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        BeforeHook.scenario = scenario;

    }

}
