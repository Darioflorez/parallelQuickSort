package com.dario.parallelQuickSort.models;

import java.util.concurrent.RecursiveAction;

/**
 * Created by dario on 2016-02-18.
 */
public class QuickSort extends RecursiveAction {

    //private final static int TRESHOLD = 100;
    private static float[] mArrayElements;

    public static void sortFloats(float[] arrayElements){
        if(arrayElements == null || arrayElements.length == 0){
            return;
        }
        mArrayElements = arrayElements;
        int mArraySize = mArrayElements.length;
        quickSort(0, mArraySize -1);
    }

    /**
     *
     * @param leftLimit: Define the beginning of the list
     * @param rightLimit: Define the final os the list
     */
    private static void quickSort(int leftLimit, int rightLimit){

//        if((CurrentRightPointer - currentLeftPointer) > TRESHOLD ){
//            //Run Parallel
//        }else{
//            //Run Serial
//        }

        /**
         * leftPointer: moves through the list from left to right
         * rightPointer: moves through the list from right to left
         */
        int leftPointer = leftLimit;
        int rightPointer = rightLimit;
        //Set pivot to the middle element of the list
        float pivot = mArrayElements[leftLimit + (rightLimit-leftLimit)/2];

        //Run this until the pointers cross each other
        while(leftPointer <= rightPointer){
            //Iterate from left until you find a element larger than pivot
            while(mArrayElements[leftPointer] < pivot){
                leftPointer++;
            }
            //Iterate from right until you find a element smaller than pivot
            while(mArrayElements[rightPointer] > pivot ){
                rightPointer--;
            }
            //Swap elements if the pointers has not cross each other
            if(leftPointer <= rightPointer){
                swapValues(leftPointer, rightPointer);
                leftPointer++;
                rightPointer--;
            }
        }
        //Now the pivot is in the right place in the list ;; Continue to sort the list
        //Recursion
        //Sort the list to the left of the pivot if the list is larger than 2 elements
        if (leftLimit < rightPointer)
            quickSort(leftLimit, rightPointer);
        //Sort the list to the right of the pivot if the list is larger than 2 elements
        if (leftPointer < rightLimit)
            quickSort(leftPointer, rightLimit);
    }

//ForkJoin
//    if (my portion of the work is small enough)
//            do the work directly
//    else
//    split my work into two pieces
//    invoke the two pieces and wait for the results

    private static void swapValues(int leftPointer, int rightPointer){
        float leftValue = mArrayElements[leftPointer];
        mArrayElements[leftPointer] = mArrayElements[rightPointer];
        mArrayElements[rightPointer] = leftValue;
    }

    @Override
    protected void compute() {

    }
}
