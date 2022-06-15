package com.sapient.asde.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldLatestTest {
    private HelloWorld helloWorld= new HelloWorld("Hello World");

    @Test
    void setGreetingForInvalidInput() {
        helloWorld.setGreetings("How are you");
        assertNotEquals("How are you?",helloWorld.getGreetings());
    }

    @Disabled
    @Test
    void getToStringForValidOutput(){
        assertEquals("HelloWorld{greeting='Hello World'}", helloWorld.toString());
    }

    @Test
    void  checkForValidDefaultConstructor(){
        HelloWorld helloWorld1= new HelloWorld();
        assertNull(helloWorld1.getGreetings());
    }


    @Disabled
    @Test
    void  checkForValidOneArgConstructor(){
        //TO DO
    }
}
