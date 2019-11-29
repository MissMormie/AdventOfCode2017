package main.days;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day4Test {

    @Test
    void isValidPassPhrase() {
        String input;
        boolean answer;

        input = "aa bb cc dd ee";
        answer = true;
        assertEquals(answer, Day4.isValidPassPhrase(input), "input = " + input + " answer: " + answer);

        input = "aa bb cc dd aa";
        answer = false;
        assertEquals(answer, Day4.isValidPassPhrase(input), "input = " + input + " answer: " + answer);

        input = "aa bb cc dd aaa";
        answer = true;
        assertEquals(answer, Day4.isValidPassPhrase(input), "input = " + input + " answer: " + answer);
    }

    @Test
    void isValidAnagramPassPhrase() {
        String input;
        boolean answer;

        input = "abcde fghij";
        answer = true;
        assertEquals(answer, Day4.isValidAnagramPassPhrase(input), "input = " + input + " answer: " + answer);

        input = "abcde xyz ecdab";
        answer = false;
        assertEquals(answer, Day4.isValidAnagramPassPhrase(input), "input = " + input + " answer: " + answer);

        input = "a ab abc abd abf abj";
        answer = true;
        assertEquals(answer, Day4.isValidAnagramPassPhrase(input), "input = " + input + " answer: " + answer);

        input = "oiii ioii iioi iiio";
        answer = false;
        assertEquals(answer, Day4.isValidAnagramPassPhrase(input), "input = " + input + " answer: " + answer);
    }

    @Test
    void runA() {
        String input;
        int answer;
        input = "aa bb cc dd ee\n" +
                "aa bb cc dd aa\n" +
                "aa bb cc dd aaa";
        answer = 2;
        assertEquals(answer, Day4.runA(input), "input = " + input + " answer: " + answer);
    }

    @Test
    void runB() {
        String input;
        int answer;
        input = "abcde fghij\n" +
                "abcde xyz ecdab\n" +
                "a ab abc abd abf abj\n" +
                "oiii ioii iioi iiio";
        answer = 2;
        assertEquals(answer, Day4.runB(input), "input = " + input + " answer: " + answer);
    }

}