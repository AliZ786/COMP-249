// -----------------------------------------------------
// Part: I
// Written by: Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
// -----------------------------------------------------
package Helicopter;

import Airplane.Airplane;

public class Helicopter extends Airplane {

	protected int numberOfCylinders;
	protected int creationYear;
	protected int passengerCapacity;
	
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

	public int getPassangerCapacity() {
		return passengerCapacity;
	}

	public void setPassangerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	@Override
	public String toString() {
		return "This Helicopter was made by " + brand + ". It has a price of " + price +
				" and was made in " + creationYear + ". It has " + numberOfCylinders + " cylinders, with a horse power of " + 
				horsePower + " and can carry " + passengerCapacity + " passengers.";
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
