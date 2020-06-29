// -----------------------------------------------------
// Part: I
// Written by: Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
// -----------------------------------------------------
package Multirotor;

import Helicopter.Helicopter;

public class Multirotor extends Helicopter {

	protected int numberOfRotors;
	
	//Default Constructor
	public Multirotor() {
		super();
	}
	
	//Parameterized Constructor
	public Multirotor(String brand, double price, int horsePower, int numberOfCylinders, int creationYear, int passengerCapacity, int numberOfRotors) {
		super(brand, price, horsePower, numberOfCylinders, creationYear, passengerCapacity);
		
		this.numberOfRotors = numberOfRotors;
	}
	
	//Copy Constructor
	public Multirotor(Multirotor m) {
		super(m);
		this.numberOfRotors = m.numberOfRotors;
	}

	public int getNumberOfRotors() {
		return numberOfRotors;
	}

	public void setNumberOfRotors(int numberOfRotors) {
		this.numberOfRotors = numberOfRotors;
	}

	@Override
	public String toString() {
		return "This Multirotor was made by " + brand + ". It has a price of " + price +
				" and was made in " + creationYear + ". It has " + numberOfCylinders + " cylinders, with a horse power of "+
				horsePower + " and can carry " + passengerCapacity + " passengers. It has " + numberOfRotors + " rotors.";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numberOfRotors;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Multirotor other = (Multirotor) obj;
		if (numberOfRotors != other.numberOfRotors)
			return false;
		return true;
	}

	
	
}
