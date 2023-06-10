package io.vaibhav.problems;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LargestElementTest {

    private final  LargestElement largestElement = new LargestElement();



    @Test
    public void  largestElementTest() {
        int input[] = {10,20, 5,9,8};
        int expected = 1 ;
        int actual = largestElement.largestElement(input);
        assertEquals(expected, actual);
    }

    @Test
    public void  largestElementTest1() {
        int input[] = {10,10, 10};
        int expected = 0 ;
        int actual = largestElement.largestElement(input);
        assertEquals(expected, actual);
    }

    @Test
    public void  largestElementNaiveTest() {
        int input[] = {10,20, 5,9,8};
        int expected = 1 ;
        int actual = largestElement.largestElementNaive(input);
        assertEquals(expected, actual);
    }

    @Test
    public void  secondLargestElement() {
        int input[] = {10 , 20 , 12 , 15, 9 };
        int expected = 3 ;
        int actual = largestElement.secondLargestElementNaive(input);
        int actual1 = largestElement.secondLargestElement(input);
        assertEquals(expected, actual);
        assertEquals(expected, actual1);
    }

    @Test
    public void  secondLargestElement1() {
        int input[] = {10,10, 10};
        int expected = -1 ;
        int actual = largestElement.secondLargestElementNaive(input);
        int actual1 = largestElement.secondLargestElement(input);
        assertEquals(expected, actual);
        assertEquals(expected, actual1);
    }


}