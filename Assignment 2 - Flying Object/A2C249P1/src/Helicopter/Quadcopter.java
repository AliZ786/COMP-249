// -----------------------------------------------------
// Part: I
// Written by: Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
// -----------------------------------------------------
package Helicopter;

public class Quadcopter extends Helicopter {

	protected int maxFlyingSpeed;
	
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

	@Override
	public String toString() {
		return "This Quadcopter was made by " + brand + ". It has a price of " + price +
				" and was made in " + creationYear + ". It has " + numberOfCylinders + " cylinders, with a horse power of " +
				horsePower + " and can carry " + passengerCapacity + " passengers. It also has a max speed of " + maxFlyingSpeed +".";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + maxFlyingSpeed;
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
		Quadcopter other = (Quadcopter) obj;
		if (maxFlyingSpeed != other.maxFlyingSpeed)
			return false;
		return true;
	}

	
	
}
