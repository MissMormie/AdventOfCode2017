package main.days;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day5Test {

    @Test
    void runA() {
        String input;
        Integer answer;

        input = "0\n" +
                "3\n" +
                "0\n" +
                "1\n" +
                "-3";
        answer = 5;
        assertEquals(answer, Day5.runA(input), "input = " + input + " answer: " + answer);

    }


    @Test
    void runB() {
        String input;
        Integer answer;

        input = "0\n" +
                "3\n" +
                "0\n" +
                "1\n" +
                "-3";
        answer = 10;
        assertEquals(answer, Day5.runB(input), "input = " + input + " answer: " + answer);

    }
}