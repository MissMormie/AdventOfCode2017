package main.days;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Day13 {

    public static void main(String[] args) {
        System.out.println("answer A: " + runA(getInput()));
        System.out.println("answer B: " + runB(getInput()));
    }

    public static int runA(String input) {
        int answer = 1;
        String[] split = input.split("\n");

        Map<Integer, Integer> depthRangeMap = new HashMap<>();
        Arrays.stream(split)
                .forEach(s -> addToMap(s, depthRangeMap));

        Integer maxDepth = Collections.max(depthRangeMap.keySet());

        int severity = 0;
        for(int depth =0; depth <= maxDepth; depth++) {
            if(depthRangeMap.containsKey(depth)) {
                int effectiveRange = depthRangeMap.get(depth) * 2 -2;
                int laserPosition = depth % effectiveRange;
                if(laserPosition == 0) {
                    severity += depthRangeMap.get(depth) * depth;
                }

            }
        }

        // DON'T FORGET TO ADD THE ANSWER
        return severity;
    }

    static void addToMap(String input, Map<Integer, Integer> depthRangeMap) {
        String[] split = input.split(": ");
        // weird numbers because the lasers move to and from effectively having more steps before its back.
        depthRangeMap.put(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
    }

    public static int runB(String input) {
        String[] split = input.split("\n");

        Map<Integer, Integer> depthRangeMap = new HashMap<>();
        Arrays.stream(split)
                .forEach(s -> addToMap(s, depthRangeMap));

        Integer maxDepth = Collections.max(depthRangeMap.keySet());

        boolean savePassage = false;
        int wait = -1;
        do {
            wait++;
            savePassage = true;
            for (int depth = 0; depth <= maxDepth; depth++) {
                if (depthRangeMap.containsKey(depth)) {
                    int effectiveRange = depthRangeMap.get(depth) * 2 - 2;
                    int laserPosition = (depth + wait) % effectiveRange;
                    if (laserPosition == 0) {
                        savePassage = false;
                        break;
                    }
                }
            }
        } while(!savePassage);

        // DON'T FORGET TO ADD THE ANSWER
        return wait;
    }

    public static String getTestInput() {
        return "";
    }

    public static String getTestAnswer() {
        return "";
    }

    public static String getInput() {
        return "0: 3\n" +
                "1: 2\n" +
                "2: 4\n" +
                "4: 4\n" +
                "6: 5\n" +
                "8: 6\n" +
                "10: 8\n" +
                "12: 8\n" +
                "14: 6\n" +
                "16: 6\n" +
                "18: 8\n" +
                "20: 8\n" +
                "22: 6\n" +
                "24: 12\n" +
                "26: 9\n" +
                "28: 12\n" +
                "30: 8\n" +
                "32: 14\n" +
                "34: 12\n" +
                "36: 8\n" +
                "38: 14\n" +
                "40: 12\n" +
                "42: 12\n" +
                "44: 12\n" +
                "46: 14\n" +
                "48: 12\n" +
                "50: 14\n" +
                "52: 12\n" +
                "54: 10\n" +
                "56: 14\n" +
                "58: 12\n" +
                "60: 14\n" +
                "62: 14\n" +
                "66: 10\n" +
                "68: 14\n" +
                "74: 14\n" +
                "76: 12\n" +
                "78: 14\n" +
                "80: 20\n" +
                "86: 18\n" +
                "92: 14\n" +
                "94: 20\n" +
                "96: 18\n" +
                "98: 17";

    }

}
