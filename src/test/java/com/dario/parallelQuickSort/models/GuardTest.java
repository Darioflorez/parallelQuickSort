package com.dario.parallelQuickSort.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dario on 2016-02-19.
 */
public class GuardTest {

    float[] arrayElements;

    @Before
    public void setUp() throws Exception {
        arrayElements = ArrayGenerator.generateRandomArrayF(1000000);
    }

    @Test
    public void testIsSortedWhenListIsNoSorted() throws Exception {
        assertEquals("List no sorted: ", false, Guard.isSortedPrimitive(arrayElements));
    }

    @Test
    public void testIsSortedWhenListIsSorted() throws Exception {
        QuickSort.sortFloats(arrayElements);
        assertEquals("List is sorted: ", true, Guard.isSortedPrimitive(arrayElements));
    }
}