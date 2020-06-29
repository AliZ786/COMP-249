// -----------------------------------------------------
// Part: II
// Written by: Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
// -----------------------------------------------------


/*
 * @author Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
 * Date created: 17 October 2019
 */

package UAVchild;

import UAV.UAV;

public class AgriculturalDrone extends UAV{

	private String brand;
	private int carryCapacity;

	//Default Constructor
	public AgriculturalDrone() {
		super();
	}

	//Parameterized Constructor
	public AgriculturalDrone(double weight, double price, String brand, int carryCapacity) {
		super(weight, price);
		this.brand = brand;
		this.carryCapacity = carryCapacity;
	}

	//Copy Constructor
	public AgriculturalDrone(AgriculturalDrone ad) {
		super(ad);
		this.brand = ad.brand;
		this.carryCapacity = ad.carryCapacity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCarryCapacity() {
		return carryCapacity;
	}

	public void setCarryCapacity(int carryCapacity) {
		this.carryCapacity = carryCapacity;
	}
	/*This method overrides the toString method of the UAV.java class
	 * (non-Javadoc)
	 * @see UAV.UAV#toString()
	 */
	@Override
	public String toString() {
		return "This Agricultural Drone is manufactured by " + brand + ". It weights " + super.getWeight() +
				" pounds, and costs " + super.getPrice() + ". It can carry up to " + carryCapacity + "kg.";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + carryCapacity;
		return result;
	}
	/* This method overrides the equals method from the UAV.java class
	 * (non-Javadoc)
	 * @see UAV.UAV#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		AgriculturalDrone other = (AgriculturalDrone) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (carryCapacity != other.carryCapacity)
			return false;
		return true;
	}



}
