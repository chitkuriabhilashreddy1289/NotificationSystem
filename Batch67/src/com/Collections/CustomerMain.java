package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomerMain {

	public static void main(String[] args) {

		Customer c1 = new Customer(1, "Abhishek", 23);
		Customer c2 = new Customer(4, "sky", 32);
		Customer c3 = new Customer(3, "kohli", 37);
		Customer c4 = new Customer(5, "dhoni", 42);
		Customer c5 = new Customer(2, "dube", 29);

		List<Customer> list = new ArrayList<>();
		list.add(c5);
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);

		Comparator<Customer> c = new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {
				if (o1.cusId < o2.cusId) {
					return -1;
				} else if (o1.cusId > o2.cusId) {
					return 1;
				} else {
					return 0;
				}
			}

		};
              Collections.sort(list, c);
		for (Customer l : list) {
			System.out.println(l);
		}
	}

}
