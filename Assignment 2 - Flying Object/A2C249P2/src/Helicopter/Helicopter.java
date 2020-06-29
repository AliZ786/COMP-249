// -----------------------------------------------------
// This is a child class of Airplane called helicopter
// Part: II
// Written by: Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
// -----------------------------------------------------



/*
 * @author Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
 * Date created: 17 October 2019
 */
package Helicopter;

import Airplane.Airplane;

public class Helicopter extends Airplane {

	private int numberOfCylinders;
	private int creationYear;
	private int passengerCapacity;
	
	//Default Constructor
	public Helicopter() {
		super();
	}

	//Parameterized Constructor
	public Helicopter(String brand, double price, int horsePower, int numberOfCylinders, int creationYear, int passengerCapacity) {
		super(brand, price, horsePower);
		this.numberOfCylinders = numberOfCylinders;
		this.creationYear = creationYear;
		this.passengerCapacity = passengerCapacity;
	}

	//Copy Constructor
	public Helicopter(Helicopter h) {
		super(h);
		this.numberOfCylinders = h.numberOfCylinders;
		this.creationYear = h.creationYear;
		this.passengerCapacity = h.passengerCapacity;
	}

	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}

	public void setNumberOfCylinders(int numberOfCylinders) {
		this.numberOfCylinders = numberOfCylinders;
	}

	public int getCreationYear() {
		return creationYear;
	}

	public void setCreationYear(int creationYear) {
		this.creationYear = creationYear;
	}

	public int getpassengerCapacity() {
		return passengerCapacity;
	}

	public void setpassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	/*
	 * @Override Overrides the toString from the Airplane class
	 * @return returns a string that prints a message
	 * 
	 */
	@Override
	public String toString() { // Notice we need the getBrand() and getPrice() since the attributes are now private
		return "This Helicopter was made by " + super.getBrand() + ". It has a price of " + super.getPrice() +
				" and was made in " + creationYear + ". It has " + numberOfCylinders + " cylinders, with a horse power of " + 
				super.getHorsePower() + " and can carry " + passengerCapacity + " passengers.";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + creationYear;
		result = prime * result + numberOfCylinders;
		result = prime * result + passengerCapacity;
		return result;
	}
	/* @Override Overrides the equals method from the Airplane class
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Helicopter other = (Helicopter) obj;
		if (creationYear != other.creationYear)
			return false;
		if (numberOfCylinders != other.numberOfCylinders)
			return false;
		if (passengerCapacity != other.passengerCapacity)
			return false;
		return true;
	}

	
	
}
