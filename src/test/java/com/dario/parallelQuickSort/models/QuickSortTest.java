package com.dario.parallelQuickSort.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dario on 2016-02-19.
 */
public class QuickSortTest {

    float[] arrayElements;

    @Before
    public void setUp() throws Exception {
        arrayElements = ArrayGenerator.generateFloatRandomArray(100);
    }

    @Test
    public void testSortInteger() throws Exception {
        QuickSort.sortFloats(arrayElements);
        assertEquals("List is sorted: ", true, Guard.isSorted(arrayElements));
    }
}