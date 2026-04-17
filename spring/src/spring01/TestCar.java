package spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {

	public static void main(String[] args) {
		/*
		 * Car c=new Car(); c.setBrand("toyota"); c.setModel("hilux");
		 * c.setPrice(600000.0);
		 * 
		 * System.out.println(c.getBrand()); System.out.println(c.getModel());
		 * System.out.println(c.getPrice());
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Car c = (Car) context.getBean("c");

		System.out.println(c.getBrand());
		System.out.println(c.getModel());
		System.out.println(c.getPrice());
		System.out.println(c.getColor());
	}

}
