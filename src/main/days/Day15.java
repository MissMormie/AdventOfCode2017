package main.days;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Day15 {
    public static BigInteger genAValue = new BigInteger("516");
    public static BigInteger genBValue = new BigInteger("190");

    public static BigInteger genAFactor = new BigInteger("16807");
    public static BigInteger genBFactor = new BigInteger("48271");

    public static BigInteger divider = new BigInteger("2147483647");
    public static int rounds = 40_000_000;

    public static void main(String[] args) {
//        System.out.println("answer A: " + runA(getInput()));
        System.out.println("answer B: " + runB(getInput()));
    }

    public static int runA(String input) {
        int matches = 0;

        for(int i = 0; i < rounds; i++) {
            genAValue = calculateNextGenValue(genAValue, genAFactor);
            genBValue = calculateNextGenValue(genBValue, genBFactor);

            matches += judge();
        }

        return matches;
    }

    public static int judge() {
        return getLast16BinaryDigits(genAValue).endsWith(getLast16BinaryDigits(genBValue)) ? 1 : 0;
    }

    public static String getLast16BinaryDigits(BigInteger big) {
        String s = Integer.toBinaryString(big.intValue());
        if(s.length() < 16)  {
            return s;
        }
        return s.substring(s.length() - 16);
    }

    public static BigInteger calculateNextGenValue (BigInteger genValue, BigInteger genFactor) {
        return genValue.multiply(genFactor).mod(divider);
    }

    public static int roundsB = 5_000_000;


    public static int runB(String input) {
        int matches = 0;

        for(int i = 0; i < roundsB; i++) {
            calculateNextGenAValue();
            calculateNextGenBValue();

            matches += judge();
        }

        return matches;
    }

    static BigInteger multipleForGenA = new BigInteger("4");
    static BigInteger zero = new BigInteger("0");

    static void calculateNextGenAValue() {
        boolean acceptedValue = false;
        do {
            genAValue = calculateNextGenValue(genAValue, genAFactor);
            if(genAValue.mod(multipleForGenA).equals(zero)) {
                acceptedValue = true;
            }
        } while (!acceptedValue) ;
    }

    static BigInteger multipleForGenB = new BigInteger("8");

    static void calculateNextGenBValue() {
        boolean acceptedValue = false;
        do {
            genBValue = calculateNextGenValue(genBValue, genBFactor);
            if(genBValue.mod(multipleForGenB).equals(zero)) {
                acceptedValue = true;
            }
        } while (!acceptedValue) ;
    }

    public static String getInput() {
        return "";

    }

}
