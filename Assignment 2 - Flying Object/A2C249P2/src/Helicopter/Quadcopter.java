// -----------------------------------------------------
// This class is a class child of helicopter called quacopter
// Part: II

// Written by: Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
// -----------------------------------------------------

/*
 * @author Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
 * Date created: 17 October 2019
 */
package Helicopter;

public class Quadcopter extends Helicopter {

	private int maxFlyingSpeed;
	
	//Default Constructor
	public Quadcopter() {
		super();
	}

	//Parameterized Constructor
	public Quadcopter(String brand, double price, int horsePower, int numberOfCylinders, int creationYear, int passengerCapacity, int maxFlyingSpeed) {
		super(brand, price, horsePower, numberOfCylinders, creationYear, passengerCapacity);
		
		this.maxFlyingSpeed = maxFlyingSpeed;
	}
	
	//Copy Constructor
	public Quadcopter(Quadcopter q) {
		super(q);
		this.maxFlyingSpeed = q.maxFlyingSpeed;

	}

	public int getMaxFlyingSpeed() {
		return maxFlyingSpeed;
	}

	public void setMaxFlyingSpeed(int maxFlyingSpeed) {
		this.maxFlyingSpeed = maxFlyingSpeed;
	}
/* This method overrides the toString of the Helicopter class
 * (non-Javadoc)
 * @see Helicopter.Helicopter#toString()
 */
	@Override
	public String toString() {
		return "This Quadcopter was made by " + super.getBrand() + ". It has a price of " + super.getPrice() +
				" and was made in " + super.getCreationYear() + ". It has " + super.getNumberOfCylinders()+ " cylinders, with a horse power of " +
				super.getHorsePower() + " and can carry " + super.getpassengerCapacity() + " passengers. It also has a max speed of " + maxFlyingSpeed +".";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + maxFlyingSpeed;
		return result;
	}
/* This method overrides the equals method of Helicopter.java
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
		Quadcopter other = (Quadcopter) obj;
		if (maxFlyingSpeed != other.maxFlyingSpeed)
			return false;
		return true;
	}

	
	
}
