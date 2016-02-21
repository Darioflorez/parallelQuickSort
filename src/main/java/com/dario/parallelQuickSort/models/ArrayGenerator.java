package com.dario.parallelQuickSort.models;

import java.util.Random;

/**
 * Created by dario on 2016-02-18.
 */
public class ArrayGenerator {

    public static Float[] generateFloatRandomArray(int arraySize){
        Float[] arrayElements = new Float[arraySize];
        Random ran = new Random();
        Double maxValue = (5* Math.pow(10.0, 6.0));
        int threshold = maxValue.intValue();

        for(int counter = 0; counter < arraySize; counter++){
            arrayElements[counter] = (float)ran.nextInt(threshold);
        }
        return arrayElements;
    }

    public static float[] generateRandomArrayF(int arraySize){
        float[] arrayElements = new float[arraySize];
        Random ran = new Random();
        Double maxValue = (5* Math.pow(10.0, 6.0));
        int threshold = maxValue.intValue();

        for(int counter = 0; counter < arraySize; counter++){
            arrayElements[counter] = (float)ran.nextInt(threshold);
        }
        return arrayElements;
    }

    public static int[] generateIntegerRandomArray(int arraySize){
        int[] arrayElements = new int[arraySize];
        Random ran = new Random();
        Double maxValue = (5* Math.pow(10.0, 6.0));
        int threshold = maxValue.intValue();

        for(int counter = 0; counter < arraySize; counter++){
            arrayElements[counter] = ran.nextInt(100);
        }
        return arrayElements;
    }
}
