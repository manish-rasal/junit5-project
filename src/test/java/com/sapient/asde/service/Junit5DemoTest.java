package com.sapient.asde.service;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("smoke test")
public class Junit5DemoTest {
    private String[] words={"cali", "mali", "dani", "vallei"};

    @ParameterizedTest
    @ValueSource(strings = {"cali", "mali", "dani", "vallei"})
    void endsWithi(String string){
        assertTrue(string.endsWith("i"));
    }

//    @ParameterizedTest
//    @ArraySources(
//            arrays = {@ArraySource(array={"cali", "mali", "dani", "vallei"})}
//    )
//    void arrayTest(String[] array){
//
//    }

    @RepeatedTest(value = 5)
    @DisplayName("It is a repeating test")
    void customDisplayName(RepetitionInfo repInfo, TestInfo info){
        int i=6;
        assertNotEquals(repInfo.getCurrentRepetition(),i);
    }
}
