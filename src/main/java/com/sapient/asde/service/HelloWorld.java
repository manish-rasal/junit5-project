package com.sapient.asde.service;

public class HelloWorld {
    private String greetings;

    public HelloWorld(){

    }

    public HelloWorld(String greetings){
        this.greetings = greetings;
    }

    public String getGreetings() {
        return greetings;
    }

    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "greetings= " + greetings + '\'' +
                '}';
    }


}
