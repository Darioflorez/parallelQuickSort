package com.dario.parallelQuickSort.models;

/**
 * Created by dario on 2016-02-19.
 */
public class Guard {

    public static boolean isSorted(float[] list){

        for(int i = 1; i < list.length-2; i++){
            if(list[i-1]<list[i] && list[i] < list[i+1]){
                return false;
            }
        }
        return true;
    }
}
