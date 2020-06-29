// -----------------------------------------------------
// Assignment 1
// Question 1 Part 1
// Written by: Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
// -----------------------------------------------------


/**
 * Names: Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
// Comp 249- Fall 2019 Section E
// Assignment : #1 Question 1 Part 1
// Due Date: Friday, September 27, 2019, 11:59 PM
 */
/**
 * Date : September 25-2019
 * This is a program which allows the user to get different attributes of an appliance and compare if two appliances are equal or not.
 * @author Souvik Palal Alam and Mohammad Ali Zahir
 * @version Photon Release (4.8.0)
 */

public class Appliance {
	/**
	 * We declare our variables here.
	 */


	private String type;
	private String brand;
	private long serial_number;
	private double price;
	public static int count = 0; 

	/**
	 * This is our parameterized constructor which takes 3 parameters initialized with valid values
	 * @param t type of appliance
	 * @param b brand of appliance 
	 * @param p price of the appliance 
	 * @param Sn serial number of the appliance
	 */

	public Appliance(String t, String b, double p, long Sn)

	{
		type = t;
		brand = b;
	    serial_number = Sn;
		
		//Serial number will start at 1000000 and increase by the number of appliances

		/**
		 * If statement to determine and make sure that the valid price price for an appliance is at least 1$.
		 */
		if(p < 1) //price cannot be less than $1, if statement for validation
		{
			System.out.println("Price of an appliance cannot be less than $1.");
			price = 1; //automatically setting price to 1 if price is lower than 1
		}
		else
			price = p;
	}

	/**
	 * Setter of the type of the appliance
	 * @param t type of the appliance 
	 */
	public void setType(String t) {

		type = t;
	}
	/**
	 * Getter for the type of the appliance
	 * @return returns the value of type 
	 */


	public String getType() {

		return type;
	}

	/**
	 * Setter for the brand of the appliance
	 * @param b brand of the appliance
	 */
	public void setBrand(String b) {

		this.brand =b;
	}

	/**
	 * Getter for the brand of the appliance
	 * @return returns brand of the appliance
	 */

	public String getBrand() {

		return brand;
	}
	/**
	 * Setter for the price of the appliance
	 * @param p price of the appliance
	 */ 

	public void setPrice(double p) {

		this.price = p;
	}
	/**
	 * Getter for the price of the appliance
	 * @return returns price of the appliance
	 */
	public double getPrice() {

		return price;
	}
	/**
	 * Getter for the serial number of the appliance
	 * @return returns serial number of the appliance
	 */

	//Only serial number will not have an accessor
	public long getNumber() {

		return serial_number;
	}
	/**
	 * Methods which returns the amount of appliances created.
	 * @return returns the amount of appliance
	 */


	public static int findNumberOfCreatedAppliances() {

		return count;
	}
	/**
	 * Method to see if 2 appliances are the same in brand, type and price
	 * @param otherApp an Appliance object which is created to compare two appliances
	 * @return returns a boolean value depending if two appliances are equal or not
	 */

	public boolean equals(Appliance otherApp) {

		if(this.brand.equals(otherApp.getBrand()) && this.type.equals(otherApp.getType()) && this.price == otherApp.getPrice())
			return true;
		else
			return false;
	}
	/**
	 *Method to return a string which prints the attributes of an appliance
	 *@return return a string which prints attributes of the appliance
	 */

	public String toString() {

		return "Type: " + type + "\nBrand: " + brand + "\nSerial Number: " + serial_number + "\nPrice: " + price;
	}

}
