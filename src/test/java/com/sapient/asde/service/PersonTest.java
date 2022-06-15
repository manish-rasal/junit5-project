package com.sapient.asde.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private Person person;

    @BeforeEach
    void setUp() {
        person = new Person(123456789123L,"Max", LocalDate.of(1991,12,25),"Pune",7073803238L);
    }

    @AfterEach
    void tearDown() {
        person=null;
    }

    @Test
    void defaultConstructorTest(){
        Person person1 = new Person();
        assertNull(person1.getMobile());
    }

    @Test
    void adharCardValidTest() {
        assertEquals(123456789123L,person.getAdharCard());
    }

    @Test
    void setAdharCardValidTest() {
        person.setAdharCard(123456789123L);
        assertEquals(123456789123L,person.getAdharCard());
    }

    @Test
    void getNameTest() {
        assertEquals("Max",person.getName());
    }

    @Test
    void setNameTest() {
        person.setName("Max");
        assertEquals("Max",person.getName());
    }

    @Test
    void getBirthdateTest() {
        assertEquals(LocalDate.of(1991,12,25),person.getBirthdate());
    }

    @Test
    void setBirthdateTest() {
        person.setBirthdate(LocalDate.of(1991,12,25));
        assertEquals(LocalDate.of(1991,12,25),person.getBirthdate());
    }

    @Test
    void getAddressTest() {
        assertEquals("Pune",person.getAddress());
    }

    @Test
    void setAddressTest() {
        person.setAddress("Pune");
        assertEquals("Pune",person.getAddress());
    }

    @Test
    void getMobileTest() {
        assertEquals(7073803238L,person.getMobile());
    }

    @Test
    void setMobileTest() {
        assertEquals(7073803238L,person.getMobile());
    }

    @Test
    void testToStringTest() {
        assertEquals("Person{adharCard= 123456789123, name= Max', birthdate= 1991-12-25, address= Pune', mobile= 7073803238}",person.toString());
    }
}