package com.pavan.firstspringproject;

import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements Sort_algo {
    public int[] sort(int [] arr){
        System.out.println("--------------------------");
        System.out.println("Using Bubble Sort to Sort");
        System.out.println("--------------------------");
        return arr;
    }
}
