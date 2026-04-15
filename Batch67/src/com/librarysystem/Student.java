package com.librarysystem;

public class Student {

     static int maxBooks;
    	 static {
    		 maxBooks=5;
    		
     }
    	 static int memberIdcounter= 1;
    	 int memberId;
    	 int booksIssued;
    	 {
    		 memberId=memberIdcounter ++;
    	 }
    	 void displaystudentDetails()
    	 {
    		 System.out.println("member ID :" + memberId);
    		 System.out.println("Books Issued:" + booksIssued);
    	
    	 }
    	 {
    		 System.out.println();
    	 }
    	    	 void studentlibraryrule()
    	 {
    		 System.out.println("LibraryRule :"+ maxBooks+"books");
    	 } 
    	      
      

	public static void main(String[] args) {
		
	}

}
