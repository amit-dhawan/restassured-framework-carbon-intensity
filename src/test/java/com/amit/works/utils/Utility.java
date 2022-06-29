package com.amit.works.utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Utility {

    private static RequestSpecification requestSpecification;
    private static PrintStream stream;

    public static RequestSpecification getRequestSpecification(String domain) throws IOException {
        stream = new PrintStream(new FileOutputStream("logs.txt"));
        requestSpecification = new RequestSpecBuilder().
                setBaseUri(ReadConfig.getProperty(domain + "Domain")).
                addHeader("Accept", "application/json")
                .addFilter(RequestLoggingFilter.logRequestTo(stream))
                .addFilter(ResponseLoggingFilter.logResponseTo(stream)).build();

        return requestSpecification;
    }

    public static void closePrintStream() {
        if (stream != null) {
            stream.close();
        }
    }
}
