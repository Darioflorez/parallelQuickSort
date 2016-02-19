package com.dario.parallelQuickSort;

import com.dario.parallelQuickSort.models.ArrayGenerator;
import com.dario.parallelQuickSort.models.QuickSort;
import org.openjdk.jmh.annotations.*;

import java.util.Arrays;

/**
 * Created by dario on 2016-02-18.
 */

@State(Scope.Thread)
public class BenchmarkQuickSort {

    float[] arrayElements;

    @Setup(Level.Trial)
    public void setUp(){
        //Test to sortFloats an array of 20 integers
        arrayElements = ArrayGenerator.generateFloatRandomArray(100);
        Log.i("SETTING UP......");
    }

    @Benchmark
    public void myQuickSort(){
        QuickSort.sortFloats(arrayElements);
    }

    @Benchmark
    public void arraySort(){
        Arrays.sort(arrayElements);
    }

    @Benchmark
    public void arrayParallelSort(){
        Arrays.parallelSort(arrayElements);
    }


}
//ops/s: operations per second
//=======================================SIZE 1000===================================================
//Benchmark                                                Mode  Cnt       Score      Error   Units
//parallelQuickSort.BenchmarkQuickSort.arrayParallelSort  thrpt   20  118 157,006 � 1009,195  ops/s
//parallelQuickSort.BenchmarkQuickSort.arraySort          thrpt   20  123 667,063 � 4507,847  ops/s
//parallelQuickSort.BenchmarkQuickSort.myQuickSort        thrpt   20   42 167,055 �  237,340  ops/s
//=======================================SIZE 100====================================================
//Benchmark                                                Mode  Cnt        Score       Error    Units
//parallelQuickSort.BenchmarkQuickSort.arrayParallelSort  thrpt   20  3 165 089,546 � 97294,552  ops/s
//parallelQuickSort.BenchmarkQuickSort.arraySort          thrpt   20  3 455 780,969 � 38974,957  ops/s
//parallelQuickSort.BenchmarkQuickSort.myQuickSort        thrpt   20    593 346,598 �  2628,499  ops/s