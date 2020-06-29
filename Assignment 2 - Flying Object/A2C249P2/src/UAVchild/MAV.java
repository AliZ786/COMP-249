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

public class MAV extends UAV{

	private String model;
	private double size;

	public MAV() {
		super();
	}

	public MAV(double weight, double price, String model, double size) {
		super(weight, price);
		this.model = model;
		this.size = size;
	}

	public MAV(MAV ma) {
		super(ma);
		this.model = ma.model;
		this.size =ma.size;

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}
	/*This method overrides the toString method of the UAV.java class
	 * (non-Javadoc)
	 * @see UAV.UAV#toString()
	 */
	@Override
	public String toString() {
		return "This MAV is the model " + model + " with a price of " + super.getPrice() +
				" and a weights " + super.getWeight() + " pounds. It is " + size + " centimeters.";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		long temp;
		temp = Double.doubleToLongBits(size);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		MAV other = (MAV) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (Double.doubleToLongBits(size) != Double.doubleToLongBits(other.size))
			return false;
		return true;
	}



}
