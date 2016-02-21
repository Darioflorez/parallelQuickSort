package com.dario.parallelQuickSort.models;

/**
 * Created by dario on 2016-02-19.
 */
public class Guard {

    public static boolean isSorted(Float[] list){
        for(int i = 0; i < list.length-1; i++){
            if(list[i]>list[i+1]){
                return false;
            }
        }
        return true;
    }

    public static boolean isSortedPrimitive(float[] list){
        for(int i = 0; i < list.length-1; i++){
            if(list[i]>list[i+1]){
                return false;
            }
        }
        return true;
    }
}
