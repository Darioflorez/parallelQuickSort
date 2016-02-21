package com.dario.parallelQuickSort.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dario on 2016-02-21.
 */
public class QuickSortBTest {

    Float[] arrayElements;

    @Before
    public void setUp() throws Exception {
        arrayElements = ArrayGenerator.generateFloatRandomArray(1000);
    }

    @Test
    public void testSort() throws Exception {
        QuickSortB.sort(arrayElements);
        assertEquals("List is sorted: ", true, Guard.isSorted(arrayElements));
    }

    @Test
    public void testLess() throws Exception {
        assertEquals(true, QuickSortB.less(2,5));
        assertEquals(false, QuickSortB.less(5,2));
        assertEquals(false, QuickSortB.less(5,5));
    }
}