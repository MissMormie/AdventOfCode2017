package main.days;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day2Test {

    @Test
    void runA() {
        String input;
        String answer;

        input = "5\t1\t9\t5\n" +
                "7\t5\t3\n" +
                "2\t4\t6\t8";
        answer = "18";
        assertEquals(answer, Day2.runA(input), "input = " + input + " answer: " + answer);

    }


    @Test
    void runB() {
        String input;
        String answer;

        input = "5\t9\t2\t8\n" +
                "9\t4\t7\t3\n" +
                "3\t8\t6\t5";
        answer = "9";
        assertEquals(answer, Day2.runB(input), "input = " + input + " answer: " + answer);
    }
}