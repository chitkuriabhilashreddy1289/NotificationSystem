package com.dsa;

import java.util.Scanner;

public class PrefixSum {

	public static void main(String[] args) {
		int[] arr = { 5, 8, 9, 13, 15, 18 };
		int[] prefixsum = new int[arr.length];
		prefixsum[0] = arr[0];
		int sum = 0;
		for (int i = 1; i < arr.length; i++) {
			prefixsum[i]=prefixsum[i-1]+arr[i];
		}
		for(int n:prefixsum) {
			System.out.print(n+" ");
			
		}
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("enter left index:");
        int Left=sc.nextInt();
        System.out.println("enter right index:");
        int Right=sc.nextInt();
        if(Left==0) {
        	sum=prefixsum[Right];
        }else {
        	sum=prefixsum[Right]-prefixsum[Left-1];
        }
        
        System.out.println(sum);
	}
}