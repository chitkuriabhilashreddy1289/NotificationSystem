package com.Collections;

import java.util.Scanner;

public class IntegerToBinary {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number To Conversion");
        int n=sc.nextInt();
        String binary="";
        int countof1=0;
        int countof0=0;
        while(n>0) {
        	int remainder=n%2;
        	if(remainder==1) {
        		countof1++;
        	}else {
        		countof0++;
        	}
        	binary=remainder+binary;
        	n=n/2;
        }
        System.out.println("Binary:"+binary);
        System.out.println("0's count:"+countof0);
        System.out.println("1's count:"+countof1);
	}

}
