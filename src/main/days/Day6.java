package main.days;

import main.helpers.CircularLinkedList;
import main.helpers.MathHelper;
import main.helpers.StringHelper;

import java.util.*;

import static main.helpers.StringHelper.getNumbersFromStringTabSeperated;

public class Day6 {

    public static void main(String[] args) {
        System.out.println("answer A: " + runA(getInput()));
        System.out.println("answer B: " + runB(getInput()));
    }

    public static int runA(String input) {
        // NOT VALID
        int answer = 1;
        List<Integer> numbers = getNumbersFromStringTabSeperated(input);
        CircularLinkedList<DistinctNum> circularLinkedList = new CircularLinkedList();
        numbers.stream().forEach(num -> circularLinkedList.addObject(new DistinctNum(num)));

        // Create set of distributions and add the current one.
        Set<String> distributions = new HashSet<>();
        distributions.add(getDistribution(circularLinkedList));
        while (true){
            redistributeMemory(circularLinkedList);
            int oldSizeSet = distributions.size();
            distributions.add(getDistribution(circularLinkedList));
            if(distributions.size() == oldSizeSet) {
                // We're repeating so stop
                break;
            }
        }

        answer = distributions.size();


        // DON'T FORGET TO ADD THE ANSWER
        return answer;
    }

    interface ValueGetter {
        default int valueToSubtract(List<Integer> listValues, int value) {
            return 0;
        }
    }

    static class P1 implements ValueGetter {
    }

    class P2 implements ValueGetter {

        public int valueToSubtract(List<Integer> listValues, int value) {
            return listValues.indexOf(value) + 1;
        }
    }

    public static class DistinctNum {
        Integer number;
        DistinctNum(Integer number) {
            this.number = number;
        }
    }

    public static void redistributeMemory(CircularLinkedList<DistinctNum> circleList) {
        CircularLinkedList.Node nodeWithHighestNumInList = getNodeWithHighestNumInList(circleList);
        circleList.setCurrent(nodeWithHighestNumInList);

        int memToRedistribute = circleList.getCurrent().number;
        // remove mem from block.
        circleList.getCurrent().number = 0;

        double doubleMemPerBlock = memToRedistribute/(circleList.size() * 1.0);
        int memPerBlock = (int) Math.round(Math.ceil(doubleMemPerBlock / 1.0));
        while(memToRedistribute > 0) {
            DistinctNum next = circleList.getNext();
            if(memToRedistribute < memPerBlock) {
                next.number += memToRedistribute;
                break;
            }
            next.number += memPerBlock;
            memToRedistribute -= memPerBlock;
        }

    }

    public static CircularLinkedList.Node getNodeWithHighestNumInList(CircularLinkedList<DistinctNum> circleList) {
        DistinctNum startingNum = circleList.getCurrent();
        DistinctNum checkedNum;
        CircularLinkedList.Node maxNode = null;
        int max = 0;
        do {
            checkedNum = circleList.getNext();
            if(max < checkedNum.number) {
                maxNode = circleList.getNode();
                max = checkedNum.number;
            }

        } while(startingNum != checkedNum);
        return maxNode;
    }

    public static int count = 1;
    public static String getDistribution(CircularLinkedList<DistinctNum> circularLinkedList) {
        circularLinkedList.getAndMoveToFirst();
        // loop over all numbers.
        StringBuilder sb = new StringBuilder();
        for(int i = 0; circularLinkedList.size() > i; i++) {
            sb.append(circularLinkedList.getCurrent().number + " ");
            circularLinkedList.next();
        }
        System.out.println(count  + " " + sb.toString());
        count++;
        return sb.toString();
    }

    public static int runB(String input) {
        int answer = 1;


        // DON'T FORGET TO ADD THE ANSWER
        return answer;
    }

    public static String getTestInput() {
        return "";
    }

    public static String getTestAnswer() {
        return "";
    }

    public static String getInput() {
        return "4\t1\t15\t12\t0\t9\t9\t5\t5\t8\t7\t3\t14\t5\t12\t3";
    }

}
