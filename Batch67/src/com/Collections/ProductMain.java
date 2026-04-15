package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMain {

	public static void main(String[] args) {
         Product p=new Product(1,"Iphone",500000.0);
         Product p1=new Product(2,"redme",400000.0);
         Product p2=new Product(6,"samsung",700000.0);
         Product p3=new Product(8,"pixel",900000.0);
         Product p4=new Product(4,"realme",600000.0);
         
         List<Product>list=new ArrayList<>();
         list.add(p4);
         list.add(p3);
         list.add(p2);
         list.add(p1);
         list.add(p);
         
         Collections.sort(list);
         
         for(Product l:list) {
        	 System.out.println(l);
         }
	}

}
