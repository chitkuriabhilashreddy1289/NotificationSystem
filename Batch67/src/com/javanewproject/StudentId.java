package com.javanewproject;

public class StudentId {
	
	static int id = 1;
	String name;
    long phonenumber;
	{
		id++;
	}
	
	public static void main(String[] args) {
		StudentId s = new StudentId();
		System.out.println(s.id = 1);
		System.out.println(s.name = "Abhi");
		System.out.println(s.phonenumber = 75697821);
		
	}
}
