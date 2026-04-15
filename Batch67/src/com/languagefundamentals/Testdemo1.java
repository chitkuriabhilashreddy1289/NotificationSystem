package com.languagefundamentals;

import java.util.Scanner;

public class Testdemo1 {
	

public static void main(String[] args) {
	System.out.println("main method started");
     Testdemo1 t1 = new Testdemo1() ;
	     
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter The  y Value");
	    int y = sc.nextInt();
	    System.out.println("Enter The z value");
	    int z = sc.nextInt();
//	    scanner.close();
	  
	   t1. add(y,z);
	  
	   
}
 
    
void add(int a ,int b){
	System.out.println("Addition of two numbers:"+(a+b));
	int c = a+b;
	Scanner sc= new Scanner(System.in);
	int d = sc.nextInt();
	sub(c,d);
}
void sub(int c, int d ) {
	System.out.println("Subtraction of two numbers:"+(c-d));
	int e = c-d;
	Scanner sc= new Scanner(System.in);
	int f = sc.nextInt();
	mul(e,f);
//	Scanner.close();
}
void mul(int e , int f){
     System.out.println("product of two numbers:"+e*f);
     int g = e*f;
     Scanner sc= new Scanner(System.in);
     int h  = sc.nextInt();
      div(g,h);
}
void div(double g,double h) {
	System.out.println("division of two numbers:"+g%h);
	

	
	
}
}