package com.example;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SortHelperTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testBubbleSort()
    {   
        int[] arr = {11,68,55,54,23};
        int[] expectedArr = {11,23,54,55,68};
     
        SortHelper.bubbleSort(arr);
        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void testQuickSort(){

        int[] arr = {11,68,55,54,23};
        int[] expectedArr = {11,23,54,55,68};
        SortHelper.quickSort(arr);
        assertArrayEquals(expectedArr, arr);
    }
    
    
}
