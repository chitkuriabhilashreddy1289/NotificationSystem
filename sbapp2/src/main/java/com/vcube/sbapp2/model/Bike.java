package com.vcube.sbapp2.model;

import org.springframework.stereotype.Component;

@Component
public class Bike {
	private String model;
	private String brand;
	private double price;
	private String colour;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public Bike(String model, String brand, double price, String colour) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.colour = colour;
	}
	
  
}
