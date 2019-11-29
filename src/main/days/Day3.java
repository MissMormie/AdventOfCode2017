package main.days;

import main.helpers.Coordinate;

public class Day3 {

    public static void main(String[] args) {
        runA(getInput());
        runB(getInput());
    }

    public static int runA(String input) {
        int horizontalLength = 1;
        int verticalLength = 1;
        Coordinate corner = new Coordinate(0, 0);
        int intInput = Integer.parseInt(input);
        boolean directionIsHorizontal = true;

        for(int numOnCoord = 2; numOnCoord <intInput;) {
            int numForNextCoord;
            System.out.print("number " + numOnCoord + " ");

            // Calculate new row or column corner.
            if (directionIsHorizontal) {

                corner.x += corner.x <= 0 ? +horizontalLength : -horizontalLength;
                numForNextCoord = numOnCoord + verticalLength;
                horizontalLength += 1;
            } else {
                corner.y += corner.y <= 0 ? +verticalLength : -verticalLength;
                numForNextCoord = numOnCoord + horizontalLength;
                verticalLength += 1;
            }
            directionIsHorizontal = !directionIsHorizontal;
            System.out.println("number " + numOnCoord + " " + corner);


            // Check if the next corner is bigger than the num we need.
            if (intInput - numForNextCoord <= 0) {
                int stepsLeft = intInput - numOnCoord;
                if (directionIsHorizontal) {
                    corner.x += corner.x <= 0 ? +stepsLeft : -stepsLeft;
                } else {
                    corner.y += corner.y <= 0 ? +stepsLeft : -stepsLeft;
                }
                break;
            }

            numOnCoord = numForNextCoord;
        }


        // DON'T FORGET TO ADD THE ANSWER
        int answer = corner.getManhattanDistance(0,0);
        System.out.println("answer A: " + answer);
        return answer;
    }


    public static boolean directionIsHorizontal = true;
    public static int horizontalLength = 1;
    public static int verticalLength = 1;


    public static int runB(String input) {





        // DON'T FORGET TO ADD THE ANSWER
        int answer = 1;
        System.out.println("answer B: " + answer);
        return answer;
    }

    public static String getTestInput() {
        return "";
    }

    public static String getTestAnswer() {
        return "";
    }

    public static String getInput() {
        return "368078";
    }

    public static class CoordWithValue extends Coordinate {

        public CoordWithValue(int x, int y) {
            super(x, y);
        }
    }

}
