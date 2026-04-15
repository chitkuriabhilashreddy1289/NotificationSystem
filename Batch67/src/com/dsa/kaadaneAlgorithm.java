package com.dsa;

public class kaadaneAlgorithm {

	public static void main(String[] args) {
		int[] arr = { -1, -3, -4, 5, -2, 6, 4, -3, 2, -2 };
		int currentsum=0;
		int max=Integer.MIN_VALUE;;
		for(int i=0;i<arr.length;i++) {
			currentsum+=arr[i]; 
			if(currentsum>max) {
				max=currentsum;
		 	}
			if(currentsum<0) {
				currentsum=0;
			}
		}
		System.out.println("sum of maxsubarray:"+max);
	}
	

}
