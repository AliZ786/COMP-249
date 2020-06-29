// -----------------------------------------------------
// Assignment 1
// Question 1 Part 2
// Written by: Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
// -----------------------------------------------------


/**
 * Names: Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
// Comp 249- Fall 2019 Section E
// Assignment : #1 Question 1 Part 1
// Due Date: Friday, September 27, 2019, 11:59 PM
 */



import java.util.Scanner;
public class Driver {

	/**
	 * This program is a driver for the Appliance.java class
	 * @param args
	 */

	public static void main (String args[]) {
		System.out.println("Hello! Welcome to Ali's and Souvik's appliance emporium software!\n ");
		Scanner keyIn = new Scanner(System.in);
		final String password = "c249"; /** This is the password that we need to validate the 1st and second choice of our menu/

		/**
		 * This line of code creates the inventory array of appliances and ask for the amount of appliances that we want to create.
		 */

		System.out.print("How many appliances do you want? ");
		int maxAppliances = keyIn.nextInt();
		System.out.println();
		Appliance [] inventory = new Appliance[maxAppliances];
		String input = "0";
		int legalAttempt =0;
		int legalAttempt1 = 0;
		int choice;
		int newAppliances = 0;
		int i=0;
		


		/**
		 * This do-while loop displays the menu with the choice that we need as long as the choice is valid.
		 */

		do {
			do {
				System.out.println();
				Driver.Menu();
				choice = keyIn.nextInt();
			}while(choice < 1 || choice >5);


			/**
			 * This switch statement is created to go through different options to the menu.
			 */

			switch (choice) 
			{

			case 1:

				legalAttempt = 0;  /**  number of attempts to input the correct password by the user */

				do {
					System.out.println("Please enter your password");
					input = keyIn.next();
					legalAttempt++;
				}
				while (legalAttempt < 3 && (password.equals(input) == false));/** prompt user for password unless entered incorrectly 3 times */


				if (legalAttempt == 3) {  /** if password is entered incorrectly 3 times... */
					legalAttempt1++;  
					if (legalAttempt1 == 4) {
						System.out.println("Program has detected suspicious activities"
								+ " and will terminate immediately!");
						System.exit(0);
					}


				}
				if(password.equals(input)) {
					System.out.println("How many appliances do you want?"); /**Ask for the amount of new appliances that the user wants to create */
					legalAttempt=0;
					do {
						newAppliances = keyIn.nextInt();
						if(newAppliances > (maxAppliances - Appliance.findNumberOfCreatedAppliances()) && newAppliances !=0){
							System.out.println("You can only add " + (maxAppliances - Appliance.findNumberOfCreatedAppliances()) + " appliance(s)");


						}
					}while(newAppliances > (maxAppliances - Appliance.findNumberOfCreatedAppliances()));

					
					/**
					 * This for-loop asks for the specifications of the appliance that the user wants to create
					 */
					for( i=1; i<=newAppliances; i++) {
						System.out.println("Type of appliance " +i);
						String type = keyIn.next();
						System.out.println("Brand of the appliance " +i);
						String brand = keyIn.next();
						System.out.println("Price of the appliance " +i);
						double price = keyIn.nextDouble();
						System.out.println("The serial number of the appliance "+i);
						long serial_number = keyIn.nextLong();
						inventory[Appliance.count] =new Appliance(type, brand, price, serial_number);
						System.out.println("New appliance is created\n");
						Appliance.count++;

					}

				}
				break;

			case 2:
				legalAttempt =0;
				do {
					System.out.println("Please enter your password");
					input = keyIn.next();
					legalAttempt++;
				}
				while (legalAttempt < 3 && (password.equals(input) == false)); /** This would ask for the valid password until the 3rd time and then return to the menu */



				if(password.equals(input)) {
					System.out.println("What is the serial number of the appliance you wish to update? "); /**Asks the serial number of the appliance you wish to update */
					long sn = keyIn.nextLong();
					{
						boolean valid = false;
						int index = 0; /** Create this to access the index of the appliance that matches the entered serial number */
						while (valid == false) {
							for (i = 0; i < inventory.length; i++) {
								if (sn == inventory[i].getNumber()) {
									index = i;/** Assign an index to to remember the index position of the object that matches the serial number */
									valid = true;
								
								}else
							/**
							 * This do-while loop would continue until we get to a serial number of one of the appliance created in the inventory array
							 */
									do { 
									 System.out.println("There is no appliance with that serial number");
									 System.out.println("Would u like to try again? (Press 0 to return to menu or write another serial number)");
									 sn = keyIn.nextLong();
									 if(sn==0) {
										 break;
									 } 
								 }while (sn!=inventory[index].getNumber());
							 
								if (sn ==0) {
									break;
							}
								/**
								 * This displays the attribute of the appliance with serial number input by the user
								 */
								System.out.println();
								System.out.println("Appliance Serial Number #" +sn);
								System.out.println("Brand: " +inventory[i].getBrand());
								System.out.println("Type: "+inventory[i].getType());
								System.out.println("Price: "+inventory[i].getPrice());
								System.out.println();
							
							int decision; /** This displays choices for the option 2 menu */
							do {
								System.out.println("\nWhich information would you like to change? "
										+ "\n\t1. brand"
										+ "\n\t2. type"
										+ "\n\t3. price"
										+ "\n\t4. Quit"
										+ "\nEnter your choice");

								decision = keyIn.nextInt();
								keyIn.nextLine();

							

								switch (decision) /** This displays different cases/options for the options in option 2 */
								{
								case 1: 
									System.out.println("Please enter the new brand:");
									String newBrand = keyIn.nextLine();
									inventory[index].setBrand(newBrand);
									System.out.println(inventory[index]); /** prints the info of the Appliance to display the change */
									break;

								case 2: 
									System.out.println("Please enter the new type");
									String newType = keyIn.nextLine();
									inventory[index].setType(newType);
									System.out.println(inventory[index]);
									break;

								case 3: 
									System.out.println("Please enter the new price");
									double newPrice = keyIn.nextDouble() ;
									inventory[index].setPrice(newPrice);
									System.out.println(inventory[index]);
									break;


								case 4:
									break;
									

								

								default: ;
								} /** End of the switch statement for option 2 menu */
							} while (decision != 4); /** When the user chooses 5 then it quits the option 2 menu */
						break;}
						break;
					}
				}
				
				break;
				}
				/**
				 * This is option 3, where we would print all the appliances with the same brand name that the user inputs
				 */
			case 3:
				System.out.println("Please specify the brand name: ");
				String speBrand = keyIn.next();
				for (int j = 0; j <newAppliances; j++) {
					if (inventory[j].getBrand().equals(speBrand))
						System.out.println(inventory[j]);  /** If the appliance has same brand as user input, it would print the info */
				}

				break;
				/**
				 * This is option 4, where we would print all the appliances with a price lower than the one that the user inputs
				 */

			case 4:

				System.out.println("Please specify the price : ");
				double spePrice = keyIn.nextDouble();
				for (int k = 0; k < newAppliances; k++) {
					if (inventory[k].getPrice() < spePrice)
						System.out.println(inventory[k]);   /** It would print all the appliances that have a lower price than the one that the user inputs */
				}

				break;
				
				/**
				 * This is option 5, where it displays the closing message and exits out of the program
				 */

			case 5: 
				

				System.out.println("Thank you for visiting the Ali's and Souvik's appliance emporium software.");
				System.out.println("Please come again");
				System.exit(0);
			}


		}while(true);








	}
/**
 * This method is to displays the main menu instead of writing it all the time 
 */
	public static void Menu() {
		System.out.println("What do you want to do? ");
		System.out.println(		"1. Enter new appliances  (password required)");
		System.out.println(     "2. Change information of an appliance (password required)");
		System.out.println(     "3. Display all appliances for a specific brand");
		System.out.println(     "4. Display all appliances under a certain price ");
		System.out.println(     "5. Quit");
		System.out.print("Plase enter your choice\n");

	}
}
