package main.days;

import main.helpers.CircularLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day6Test {

    @Test
    void runA() {
        String input;
        int answer;

        input = "0\t2\t7\t0";
        answer = 5;
        assertEquals(answer, Day6.runA(input), "input = " + input + " answer: " + answer);
    }

    @Test
    void getNodeWithHighestNumInList() {
        CircularLinkedList<Day6.DistinctNum> linkedList = new CircularLinkedList<>();
        Day6.DistinctNum highestNum = new Day6.DistinctNum(15);
        linkedList.addObject(new Day6.DistinctNum(13));
        linkedList.addObject(highestNum);
        linkedList.addObject(new Day6.DistinctNum(3));
        linkedList.addObject(new Day6.DistinctNum(15));

        assertEquals(true, Day6.getNodeWithHighestNumInList(linkedList).getObject() == highestNum);
    }

    @Test
    void getDistribution() {
        CircularLinkedList<Day6.DistinctNum> linkedList = new CircularLinkedList<>();
        Day6.DistinctNum highestNum = new Day6.DistinctNum(15);
        linkedList.addObject(new Day6.DistinctNum(13));
        linkedList.addObject(highestNum);
        linkedList.addObject(new Day6.DistinctNum(3));
        linkedList.addObject(new Day6.DistinctNum(15));

        assertEquals("13 15 3 15 ", Day6.getDistribution(linkedList));
    }
    @Test
    void redistributeMemory() {
        CircularLinkedList<Day6.DistinctNum> linkedList = new CircularLinkedList<>();
        Day6.DistinctNum highestNum = new Day6.DistinctNum(15);
        linkedList.addObject(new Day6.DistinctNum(13));
        linkedList.addObject(highestNum);
        linkedList.addObject(new Day6.DistinctNum(3));
        linkedList.addObject(new Day6.DistinctNum(15));
        Day6.redistributeMemory(linkedList);

        assertEquals("17 3 7 19 ", Day6.getDistribution(linkedList));
    }



    @Test
    void runB() {
        String input;
        int answer;

        input = "";
        answer = 0;
        assertEquals(answer, Day6.runB(input), "input = " + input + " answer: " + answer);
    }
}