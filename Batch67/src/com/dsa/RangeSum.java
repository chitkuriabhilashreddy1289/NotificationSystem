package com.dsa;

import java.util.Scanner;

public class RangeSum {

	 public static void main(String[]args) {
		int[] arr = { 5, 8, 9, 13, 15, 18 ,23,25};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter left index:");
        int Left=sc.nextInt();
        System.out.println("enter right index:");
        int Right=sc.nextInt();
        int sum=0;
        for(int i=Left;i<=Right;i++) {
        	sum+=arr[i];
        }
        System.out.println(sum);
	}
}
 