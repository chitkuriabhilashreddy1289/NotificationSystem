package com.Collections;

import java.util.HashSet;
import java.util.Set;

public class SubSetExa {
	

	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet<>();
		set1.add(6);
		set1.add(7);
		set1.add(4);
		set1.add(3);
		set1.add(2);

		Set<Integer> set2 = new HashSet<>();
		set2.add(6);
		set2.add(7);
		set2.add(4);
		set2.add(3);
		set2.add(2);
		// set2.add(9);
		// set2.add(1);
		
		if (set2.containsAll(set1)) {
			System.out.println("set1 is a subset of set2");
		}else {
			System.out.println("set1 is a not subset of set2");
		}

	}

}
