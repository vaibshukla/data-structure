package io.vaibhav.problems;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LargestElementTest {

    @Test
    public void  largestElementTest() {
        int input[] = {10,20, 5,9,8};
        int expected = 1 ;
        LargestElement largestElement = new LargestElement();
        int actual = largestElement.largestElement(input);
        assertEquals(actual, expected);
    }

}