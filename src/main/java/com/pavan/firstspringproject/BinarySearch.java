package com.pavan.firstspringproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//if two components are present of same type primary is given importance
@Component
public class BinarySearch {
    @Autowired
    private  Sort_algo sort_algo;

//autowiring with constructor injection
    public BinarySearch(Sort_algo sort_algo) {
        this.sort_algo = sort_algo;
    }

    public int binarysearch(int [] arr, int num){

        int[] sorted_arr=sort_algo.sort(arr);

        return 0;
    }

}
