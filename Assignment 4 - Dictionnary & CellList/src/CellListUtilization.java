// -----------------------------------------------------
// Assignment 4
// Question 1
// Written by: Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
// -----------------------------------------------------


/**
 * Names: Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
// Comp 249- Fall 2019 Section E
// Assignment : #4 Q2 v
// Due Date: Monday, December 2nd 2019
 */



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CellListUtilization {

	public static void main(String[] args) throws NoSuchElementException {
		
		/**
		 * Will create two empty lists here 
		 */
		CellList list1 = new CellList();
		CellList list2 = new CellList();
		
		Scanner in = new Scanner(System.in);
		Scanner s = null;
		long sn;
		String b;
		double p;
		int y;
		
		try { //Will read the whole file line by line 
			s = new Scanner(new FileInputStream("Cell_Info.txt"));
			
			while(s.hasNext()) {
				sn = s.nextLong();
				b = s.next();
				p = s.nextDouble();
				y = s.nextInt();
				list1.addToStart(new CellPhone(sn, b, y, p));
			}
			
			s.close();
			list1.showContents();
			
			System.out.println("Enter a serial number to search: "); // Prompts user to search for serial number here 
			long serialN = in.nextLong();
			list1.find(serialN);
			
			list1.addToStart(new CellPhone(1101101, "Sony", 2008, 23.30));
			list1.showContents();
			
			list1.insertAtIndex(20, new CellPhone(8996161, "ASUS", 2014, 600.69));
			list1.showContents();
			
			list1.deleteFromIndex(12);
			list1.showContents();
			
			list1.deleteFromStart();
			list1.showContents();
			
			list1.replaceAtIndex(15, new CellPhone(5318008, "LG", 2018, 900.99));
			list1.showContents();
			
			list1.find((long) 4900088);
			System.out.println(list1.contains((long) 7559090));
			list1.showContents();
			
			list2 = list1.clone();
			System.out.println(list1.equals(list2));
			list2.showContents();
		}
		catch(FileNotFoundException e) {
			System.out.println("File does not exist in path");
		}
		

	}

}
