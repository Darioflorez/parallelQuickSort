package com.dario.parallelQuickSort;

import com.dario.parallelQuickSort.models.ArrayGenerator;
import com.dario.parallelQuickSort.models.QuickSort;

import java.util.Arrays;

public class Main {

    /**
     *===================================================How to test:===================================================
     * -> Quit all other applications: Background processes can reduce the amount of resources available to your program
     *      in an unpredictable way
     *
     * -> Use a dedicated system: Do a clean install of the operating system and the minimum amount of tools needed.
     *
     * -> Repeat your tests: To draw any conclusions from a test, repeat it and use the average result.
     *      When the numbers of the test vary too much from run to run, your test is wrong
     *
     * -> Investigate memory usage: If your code under test is memory intensive, the amount of available memory will
     *      have a large impact on your test results
     *
     * -> Investigate CPU usage: If your code under test is CPU intensive, try to determine which part of your test uses
     *      the most CPU time
     *
     * -> Investigate dependencies on external systems:  If your application does not seem to be CPU-bound or memory
     *      intensive, try looking into thread-locking or dependencies on external systems
     *
     * -> Thread-locking can have a big impact, to the extent that running your test on multiple cores will decrease
     *      performance. Threads that are waiting on each other are really bad for performance.
     *
     * Reference from: http://stuq.nl/weblog/2009-01-28/why-many-java-performance-tests-are-wrong
     */

    public static void main(String[] args) {

        int [] arrayElements = ArrayGenerator.generateRandomArray(20);
        Log.i(Arrays.toString(arrayElements));
        QuickSort quickSort = new QuickSort();

        //=================TEST=====================
        for(int counter = 0; counter < 20; counter ++ ){

            Log.i("=================START TEST=====================");
//          Run Garbage collector before your test start.
            System.gc();
            long startTime = System.currentTimeMillis();
            quickSort.sort(arrayElements);
            long stopTime = System.currentTimeMillis();
            long elapsedTime = stopTime - startTime;

            Log.i("|               ELAPSED TIME: "+elapsedTime+"                |");
            Log.i("================================================");
            Log.i(Arrays.toString(arrayElements));

        }
    }
}
