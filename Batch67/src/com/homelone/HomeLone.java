package com.homelone;

public class HomeLone {
	String name;
	double loanamount;
	int years;
	double totalrepay;
static {
	System.out.println("New account has been activated");
	System.out.println("welcome to your new loan account ");
}
void calculateRepayment() {
	totalrepay = loanamount + (0.08 * years);
	calculateRepayment();
}
void showdetails() {
	System.out.println("abhi:" + name);
	System.out.println("10000:" + loanamount);
	System.out.println("5:" + years);
}

	public static void main(String[] args) {
		
	}

}
