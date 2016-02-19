package com.dario.parallelQuickSort;

import com.dario.parallelQuickSort.models.ArrayGenerator;
import com.dario.parallelQuickSort.models.QuickSort;
import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.results.Result;
import org.openjdk.jmh.results.RunResult;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

public class Start {

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
    public static void main(String... args) throws IOException, RunnerException {

//        int[] intArray = ArrayGenerator.generateIntegerRandomArray(20);
//        Log.i("=================START TEST=====================");
//        Log.i(Arrays.toString(intArray));
//        QuickSort.sortFloats(intArray);
//        Log.i(Arrays.toString(intArray));
//        Log.i("================================================");

        Options opts = new OptionsBuilder()
                .include(BenchmarkQuickSort.class.getSimpleName())
                .threads(1)
                .forks(1)
                .shouldFailOnError(true)
                .shouldDoGC(true)
                .jvmArgs("-server").build();

        new Runner(opts).run();

//        int [] arrayElements = ArrayGenerator.generateIntegerRandomArray(20);
//        Log.i(Arrays.toString(arrayElements));
//        QuickSort quickSort = new QuickSort();
//
//        //=================TEST=====================
//        for(int counter = 0; counter < 20; counter ++ ){
//
//            Log.i("=================START TEST=====================");
////          Run Garbage collector before your test start.
//            System.gc();
//            long startTime = System.currentTimeMillis();
//            quickSort.sortFloats(arrayElements);
//            long stopTime = System.currentTimeMillis();
//            long elapsedTime = stopTime - startTime;
//
//            Log.i("|               ELAPSED TIME: "+elapsedTime+"                |");
//            Log.i("================================================");
//            Log.i(Arrays.toString(arrayElements));
//
//        }
    }
}
