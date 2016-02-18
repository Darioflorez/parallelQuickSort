package com.dario.parallelQuickSort.models;

/**
 * Created by dario on 2016-02-18.
 */
public class QuickSort {

    public static int[] mArrayElements;
    public static int mArraySize;

    public void sort(int[] arrayElements){
        if(arrayElements == null || arrayElements.length == 0){
            return;
        }
        mArrayElements = arrayElements;
        mArraySize = mArrayElements.length;
        quickSort(0,mArraySize-1);
    }

    private void quickSort(int currentLeftPointer, int CurrentRightPointer){
        int leftPointer = currentLeftPointer;
        int rightPointer = CurrentRightPointer;
        //Set pivot to the middle element of the list
        int pivot = mArrayElements[currentLeftPointer + (CurrentRightPointer-currentLeftPointer)/2];

        while(leftPointer <= rightPointer){
            //Iterate from left until you find a element larger than pivot
            while(mArrayElements[leftPointer] < pivot){
                leftPointer++;
            }
            //Iterate the list from right until you find a element smaller than pivot
            while(mArrayElements[rightPointer] > pivot ){
                rightPointer--;
            }
            if(leftPointer <= rightPointer){
                swapValues(leftPointer, rightPointer);
                leftPointer++;
                rightPointer--;
            }
        }
        //Recursion
        if (currentLeftPointer < rightPointer)
            quickSort(currentLeftPointer, rightPointer);
        if (leftPointer < CurrentRightPointer)
            quickSort(leftPointer, CurrentRightPointer);
    }

    private void swapValues(int leftPointer, int rightPointer){
        int leftValue = mArrayElements[leftPointer];
        mArrayElements[leftPointer] = mArrayElements[rightPointer];
        mArrayElements[rightPointer] = leftValue;
    }
}
