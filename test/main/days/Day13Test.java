package main.days;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day13Test {
    @Test
    void runA() {
        String input;
        int answer;

        input = "0: 3\n" +
                "1: 2\n" +
                "4: 4\n" +
                "6: 4";
        answer = 24;
        assertEquals(answer, Day13.runA(input), "input = " + input );
    }


    @Test
    void runB() {
        String input;
        int answer;

        input = "0: 3\n" +
                "1: 2\n" +
                "4: 4\n" +
                "6: 4";
        answer = 10;
        assertEquals(answer, Day13.runB(input), "input = \n" + input);
    }
}