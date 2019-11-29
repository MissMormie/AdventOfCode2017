package main.days;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day3Test {

    @Test
    void runA() {
        String input;
        int answer;

        input = "1";
        answer = 0;
        assertEquals(answer, Day3.runA(input), "input = " + input + " answer: " + answer);

        input = "12";
        answer = 3;
        assertEquals(answer, Day3.runA(input), "input = " + input + " answer: " + answer);

        input = "23";
        answer = 2;
        assertEquals(answer, Day3.runA(input), "input = " + input + " answer: " + answer);

        input = "1024";
        answer = 31;
        assertEquals(answer, Day3.runA(input), "input = " + input + " answer: " + answer);

    }


    @Test
    void runB() {
        String input;
        int answer;

        input = "";
        answer = 1;
        assertEquals(answer, Day3.runB(input), "input = " + input + " answer: " + answer);
    }
}