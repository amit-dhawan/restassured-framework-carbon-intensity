package com.amit.works.hooks;

import com.amit.works.utils.Utility;
import io.cucumber.java.After;

public class AfterHooks {

    @After
    public void afterHook(){
        Utility.closePrintStream();
    }
}
