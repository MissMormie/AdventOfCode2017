package main.days;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day1Test {

    @Test
    void runA_1() {
        String input;
        String answer;

        input = "1122";
        answer = "3";
        assertEquals(answer, Day1.runA(input), "input = " + input + " answer: " + answer);

        input = "1111";
        answer = "4";
        assertEquals(answer, Day1.runA(input), "input = " + input + " answer: " + answer);

        input = "1234";
        answer = "0";
        assertEquals(answer, Day1.runA(input), "input = " + input + " answer: " + answer);

        input = "91212129";
        answer = "9";
        assertEquals(answer, Day1.runA(input), "input = " + input + " answer: " + answer);
    }



    @Test
    void runB() {
        String input;
        String answer;

        input = "1212";
        answer = "6";
        assertEquals(answer, Day1.runB(input), "input = " + input + " answer: " + answer);

        input = "1221";
        answer = "0";
        assertEquals(answer, Day1.runB(input), "input = " + input + " answer: " + answer);

        input = "123425";
        answer = "4";
        assertEquals(answer, Day1.runB(input), "input = " + input + " answer: " + answer);

        input = "123123";
        answer = "12";
        assertEquals(answer, Day1.runB(input), "input = " + input + " answer: " + answer);

        input = "12131415";
        answer = "4";
        assertEquals(answer, Day1.runB(input), "input = " + input + " answer: " + answer);

    }
}