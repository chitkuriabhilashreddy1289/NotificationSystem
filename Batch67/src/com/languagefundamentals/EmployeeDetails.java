package com.languagefundamentals;

public class EmployeeDetails {
		Integer employeeno = 4;
		String employeename = "sai";
		Double salary = 5000.00;
		String hiredate = "04/05/2025";
		Integer experience = 7 ;
		{
			System.out.println("EmployeeN0:"+employeeno);
			double AnnualIncome = 12*salary;
			System.out.println("Employee Name:"+employeename);
			System.out.println("Hiredate:"+hiredate);
	         double YearlyBonus = AnnualIncome*0.10;
	         System.out.println("YEARLYBONUS:"+YearlyBonus);
	         System.out.println("AnnualIncome:"+AnnualIncome);
	         double Salary = AnnualIncome+YearlyBonus;
	         System.out.println("AnnualSalary:"+Salary);
			
			
			
		}

	public static void main(String[] args) {
		System.out.println("main method started");
		EmployeeDetails e1 = new EmployeeDetails();
		
	}	
}
