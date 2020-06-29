// -----------------------------------------------------
// Assignment 4
// Question 1
// Written by: Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
// -----------------------------------------------------
//
//A driver class used to test the CellList class
/**
 * Names: Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
// Comp 249- Fall 2019 Section E
// Assignment : #4 Q2 
// Due Date: Monday, December 2nd 2019
 */




import java.util.Scanner;

public class CellPhone implements Cloneable{

	
	private long serialNum;
	private String brand;
	private int year;
	private double price;
	Scanner in = new Scanner(System.in);
	
	public CellPhone(long sn, String br, int y, double p) { // Parameterized constructor 
		
		this.serialNum=sn;
		this.brand = br;
		this.year = y;
		this.price = p;
		
	}
	
	public CellPhone(CellPhone c, long sn) { //Copy constructor 
		this.brand = c.brand;
		this.price = c.price;
		this.year = c.year;
		this.serialNum = sn;
	}
	
	
	/**
	 * Start of getter and setters 
	 * @return SerialNum, brand, year and price : All attributes for a cellphone
	 */
	public long getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(long serialNum) {
		this.serialNum = serialNum;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Object clone() { // Clone method for the cellphone 
		System.out.println("Enter the serial number: ");
		long SerialNumber = in.nextLong();
		return new CellPhone(this, SerialNumber);
	}
	
	public String toString() { // ToString method for the cellphone 
		return  "[ " + serialNum + "\t" + brand + "\t" + price + "\t" + year + " ]";
	}

	@Override
	public boolean equals(Object obj) { // Equals method for the cellphone 
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CellPhone other = (CellPhone) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	
	
	
}
