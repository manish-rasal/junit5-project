package com.sapient.asde.service;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The methods annotated with @BeforeAll and @AfterAll have to be static method
 */
public class HelloWorldTest {

    private HelloWorld helloWorld;

    @BeforeAll
    static void beforeAll(){
        System.out.println("Code in this method executes before all test methods");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Code in this method executes after all test methods");
    }


    //execute the code within this method before each test method
    @BeforeEach
    void setUp() {
        helloWorld=new HelloWorld("Hello World");
    }

    //execute the code within this method after each test method
    @AfterEach
    void tearDown() {
        helloWorld=null;
    }

    @DisplayName("Testing getGreeting() for valid data")

    @Test
    void getGreetingsForValidData() {
        assertEquals("Hello World",helloWorld.getGreetings());
    }

    @Test
    void getGreetingsForInvalidData() {
        assertNotEquals("Hello World!",helloWorld.getGreetings());
    }

    @Test
    void setGreetingsForValidInput() {
        helloWorld.setGreetings("How are you?");
        assertEquals("How are you?",helloWorld.getGreetings());
    }

    @Test
    void setGreetingsForInvalidInput() {
        helloWorld.setGreetings("How are you?");
        assertNotEquals("How are you",helloWorld.getGreetings());
    }

    @Test
    void getToStringForValidOutput(){
        assertEquals("HelloWorld{greetings= Hello World'}",helloWorld.toString());
    }

    @Test
    void getToStringForInvalidOutput(){
        assertNotEquals("HelloWorld{ greetings= Hello World'}",helloWorld.toString());
    }

    @Test
    void checkForValidDefaultConstructor(){
        HelloWorld helloWorld1 = new HelloWorld();
        assertNull(helloWorld1.getGreetings());
    }

    @Disabled
    @Test
    void checkForOneArgConstructor(){
        //TO DO
    }
}