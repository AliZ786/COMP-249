// -----------------------------------------------------
// Part: II
// Written by: Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
// -----------------------------------------------------


/*
 * @author Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
 * Date created: 17 October 2019
 */
package Multirotor;

import Helicopter.Helicopter;

public class Multirotor extends Helicopter {

	private int numberOfRotors;

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
	/*This method overrides the toString method from Helicopter.java
	 * (non-Javadoc)
	 * @see Helicopter.Helicopter#toString()
	 */
	@Override
	public String toString() {
		return "This Multirotor was made by " + super.getBrand() + ". It has a price of " + super.getPrice() +
				" and was made in " + super.getCreationYear() + ". It has " + super.getNumberOfCylinders() + " cylinders, with a horse power of "+
				super.getHorsePower() + " and can carry " + super.getpassengerCapacity() + " passengers. It has " + numberOfRotors + " rotors.";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numberOfRotors;
		return result;
	}
/* This method overrides the equals method from Helicopter.java
 * (non-Javadoc)
 * @see Helicopter.Helicopter#equals(java.lang.Object)
 */
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
