package main.days;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class Day15Test {
    @Test
    void runA() {
        Day15.genAValue = new BigInteger("65");
        Day15.genBValue = new BigInteger("8921");

//        Day15.rounds = 10;

        int answer = 588;
        assertEquals(answer, Day15.runA(""), " answer: " + answer);

    }


    @Test
    void runB() {
        Day15.genAValue = new BigInteger("65");
        Day15.genBValue = new BigInteger("8921");

        int answer = 1;
        Day15.roundsB = 1056;

        assertEquals(answer, Day15.runB("")," answer: " + answer);
    }
}