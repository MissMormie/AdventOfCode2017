package main.days;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day16Test {
    @Test
    void runA() {
        String input;
        String answer;

        input = "s1,x3/4,pe/b";
        answer = "baedc";
        Day16.programs = 5;
        assertEquals(answer, Day16.runA(input), "input = " + input + " answer: " + answer);

    }


    @Test
    void runB() {
        String input;
        String answer;
        input = "s1,x3/4,pe/b";
        Day16.programs = 5;

        answer = "abcde";
        assertEquals(answer, Day16.runB(input), "input = " + input + " answer: " + answer);
    }
}