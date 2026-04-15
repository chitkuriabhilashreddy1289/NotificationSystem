package com.Collections;

public class Product implements Comparable<Product> {
	int pid;
	String pname;
	double price;

	public Product(int pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Product o) {
		//if (this.pid < o.pid) {
			//return -1;
		//} else if (this.pid > o.pid) {
			//return 1;
		//} else {
			//return 0;
		//}
		return this.pname.compareTo(o.pname);

	}

}
