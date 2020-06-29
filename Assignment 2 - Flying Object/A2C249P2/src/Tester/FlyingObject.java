// -----------------------------------------------------
// This is the superclass 
// Part: II
// Written by: Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
// -----------------------------------------------------

/*
 * @author Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
 * Date created: 17 October 2019
 */



package Tester;

public class FlyingObject {

	private double price;
	
	public FlyingObject() { // Default constructor 
		
	}
	
	public FlyingObject(FlyingObject f) { // Copy constructor (We don't need a parameterized constructor since this is the super class and it's method are going to get overriden
		price = f.price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
