// -----------------------------------------------------
// This class implements the Airplane class
// Part: II
// Written by: Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
// -----------------------------------------------------


/*
 * @author Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
 * Date created: 17 October 2019
 */
package Airplane;

import Tester.FlyingObject;

public class Airplane extends FlyingObject{

	/*
	 * Notice that from part 1, the attributes became private
	 */
	private String brand;
	private double price;
	private int horsePower;

	//Default Constructor
	public Airplane() {

	}

	//Parameterized Constructor 
	public Airplane(String brand, double price, int horsePower) {

		this.brand = brand;
		this.price = price;
		this.horsePower = horsePower;
	}

	//Copy Constructor
	public Airplane(Airplane a) {
		this.brand = a.brand;
		this.price = a.price;
		this.horsePower = a.horsePower;
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

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	/*
	 * @Override Overrides the toString from the object class
	 * 
	 * @return returns a string that prints a message
	 * 
	 */
	@Override
	public String toString() {
		return "This Airplane is manufactured by " + brand + ". It has a price of " + price + " with a horse power of " + horsePower + ".";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + horsePower;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	/* @Override Overrides the equals method from the object class
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airplane other = (Airplane) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (horsePower != other.horsePower)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}





}
