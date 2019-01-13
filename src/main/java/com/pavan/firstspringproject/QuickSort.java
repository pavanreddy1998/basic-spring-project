package com.pavan.firstspringproject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//primary component given more importance in autowiring
@Component
@Primary
public class QuickSort implements Sort_algo {

    public int[] sort(int [] arr){
        System.out.println("--------------------------");
         System.out.println("Using Quick Sort to Sort");
        System.out.println("--------------------------");
        return arr;
    }
}
