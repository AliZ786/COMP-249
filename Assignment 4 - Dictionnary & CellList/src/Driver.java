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
// Assignment : #4 Q1
// Due Date: Monday, December 2nd 2019
 */


public class Driver {

	public static void main(String[] args) throws NoSuchElementException {
		
		CellList list = new CellList();
		list.addToStart(new CellPhone(1, "Sony", 2008, 23.30));
		list.addToStart(new CellPhone(2, "Samsung", 2011, 123.40));
		list.addToStart(new CellPhone(3, "Dell", 2004, 72.80));
		list.showContents();
		
		list.insertAtIndex(2, new CellPhone(6, "ASUS", 2014, 600.69));
		list.showContents();
		
		list.deleteFromIndex(3);
		list.showContents();
		
		list.replaceAtIndex(0, new CellPhone(10, "LG", 2018, 900.99));
		list.showContents();
		
		list.find((long) 3);
		list.contains((long) 3);
		
		CellList list2 = new CellList();
		list2.addToStart(new CellPhone(9, "ASUS", 2014, 600.69));
		list2.addToStart(new CellPhone(3, "Dell", 2004, 72.80));
		list2.addToStart(new CellPhone(112, "LG", 2018, 900.99));
		list2.showContents();
		
		System.out.println(list.equals(list2));
		
		
	}
}
