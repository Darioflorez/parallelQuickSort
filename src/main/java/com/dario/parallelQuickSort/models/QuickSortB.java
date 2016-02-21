package com.dario.parallelQuickSort.models;

import com.dario.parallelQuickSort.Log;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by dario on 2016-02-21.
 */
public class QuickSortB {

    public static void sort(Comparable[] arr){
        shuffleArray(arr);
        sort(arr, 0, arr.length-1);
    }

    /**
     *
     * @param arr: the list to sort
     * @param start: Define the start of the list
     * @param end: Define the end of the list
     */
    private static void sort(Comparable[] arr, int start, int end){
        if(end<=start)
            return;

        //median of 3
        int p = medianOf3(arr, start, ((end-start)/2),end);
        Comparable pivot = arr[p];
        swap(arr, start,p);
        int pointer = start;

        //iterate the list from left to right and put all element smaller than the pivot to the left of the list
        //The pointer decide where the put the elements
        for (int i=pointer+1; i<=end; i++){
            if(less(arr[i],pivot)){
                swap(arr,i,++pointer);
            }
        }
        //Swap the pivot with the last pointer element to ensure than all the elements to the
        //right of the pivot are larger and those to the left are smaller
        swap(arr,start,pointer);
        //Sort the list to the left of the pivot
        sort(arr, start, pointer-1);
        //Sort the list to the right of the pivot
        sort(arr, pointer+1, end);

    }

    public static boolean less(Comparable a, Comparable b){
        if((a.compareTo(b)) < 0)
            return true;
        return false;
    }

    private static void swap(Comparable[] arr, int pointerA, int pointerB){
        Comparable temp = arr[pointerA];
        arr[pointerA] = arr[pointerB];
        arr[pointerB] = temp;
    }

    private static int medianOf3(Comparable[] arr, int start, int middle, int end){
        if(less(arr[start], arr[middle]) && less(arr[middle], arr[end]))
            return middle;
        else if(less(arr[middle], arr[start]) && less(arr[start], arr[end]))
            return start;
        else
            return start;
    }

    private static void shuffleArray(Comparable[] arr){

        Random random = ThreadLocalRandom.current();
        Comparable temp;
        int index;
        for (int i=arr.length-1; i>0; i-- ){
            index = random.nextInt(i+1);
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
}
