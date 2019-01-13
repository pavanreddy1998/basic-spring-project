package com.pavan.firstspringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringProjectApplication.class, args);


        //BinarySearch bs=new BinarySearch(new QuickSort());
        ApplicationContext ac=SpringApplication.run(FirstSpringProjectApplication.class,args);
        BinarySearch bs= ac.getBean(BinarySearch.class);
        int res=bs.binarysearch(new int[] {5,3,4,8,6,9,1},3);
        System.out.println(res);
	}



}

