package com.langfumdamentals;

import java.util.Scanner;

public class TestDemo2 {
	public static void main (String []args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Id");
		int Id = sc.nextInt();
		System.out.println("Enter you First name:");
		String fname = sc.next();
		System.out.println("Enter you last name :");
		String lname = sc.next();
		System.out.println("Enter Your phone number:");
		long pnumber = sc.nextLong();
		
		
		
		
         TestDemo2 t2 = new TestDemo2();
         t2.getstudentid(Id);
         t2.getstudentname(fname,lname);
         t2.getphonenumber(pnumber);
         
      
	}
       void getstudentid(int studentid) {
    	   System.out.println("Welcome to our college you Id is: " +studentid);
       }void getstudentname(String firstname, String lastname){
    	   System.out.println("Your full name is:"+firstname  +lastname);
    	   
       }void getphonenumber(long phonenumber){
    	   System.out.println("Your phone number:"+phonenumber);
    	   
       
         }
}
