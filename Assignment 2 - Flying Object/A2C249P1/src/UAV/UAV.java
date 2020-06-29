// -----------------------------------------------------
// Part: I
// Written by: Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
// -----------------------------------------------------
package UAV;

import Tester.FlyingObject;

public class UAV extends FlyingObject {
	
	protected double weight;
	protected double price;
	
	//Default Constructor
	public UAV() {
		
	}
	
	//Parameterized Constructor
	public UAV(double weight, double price) {
		this.weight = weight;
		this.price = price;
	}
	
	//Copy Constructor
	public UAV(UAV u) {
		this.weight = u.weight;
		this.price = u.price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "This UAV has a weight of " + weight + " pounds and a price of " + price + ".";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UAV other = (UAV) obj;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}

	
	

}
