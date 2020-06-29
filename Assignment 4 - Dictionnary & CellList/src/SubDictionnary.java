// -----------------------------------------------------
// Assignment 4
// Question 1
// Written by: Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
// -----------------------------------------------------


/**
 * Names: Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
// Comp 249- Fall 2019 Section E
// Assignment : #4 Q1
// Due Date: Monday, December 2nd 2019
 */

	import java.util.ArrayList;
	import java.util.Scanner;
	import java.io.PrintWriter;
	import java.io.FileOutputStream;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;

	public class SubDictionnary {
		
		/**
		 * Creation of the variables and the array list which stores words from an output file 
		 */

		static PrintWriter pw = null; 
		static Scanner sc = new Scanner(System.in);
		static Scanner s = null;
		static ArrayList<String> words = new ArrayList<String>();
		
		
		public static void main(String[] args) {

			System.out.print("Please enter file name: "); // Asks for the file name 
			String fileName = sc.nextLine();
			try {
				s = new Scanner(new FileInputStream(fileName));
				pw = new PrintWriter(new FileOutputStream("SubDictionary.txt")); // Creates a printwriter with the name of the subdictionnary file
				read(s);
				writer(pw);


				pw.flush();
				pw.close();
				s.close();
			}catch(FileNotFoundException e) { // If file was not found it would print this
				System.out.println("File: " + fileName +" could not be found.");
			}



		}
		public static void saving(ArrayList<String> w, String temp) { //Method used to see what would be needed to be added to the array list
			
			temp = temp.toUpperCase();

			
			if(temp.contains("0") || temp.contains("1") || temp.contains("2") || temp.contains("3")
					|| temp.contains("4") || temp.contains("5") || temp.contains("6") || temp.contains("7")
					|| temp.contains("8") || temp.contains("9")) {
				return;
				
			}
			
			else if(temp.contains(".")) {
				words.add(temp.replace(".", ""));
			}
			else if(temp.contains(",")) {
				words.add(temp.replaceAll(",", ""));
			}
			else if(temp.contains("?")) {
				words.add(temp.replace("?", ""));
			}
			else if(temp.contains(":")) {
				words.add(temp.replaceAll(":", ""));
			}
			else if(temp.contains("’")) {
				words.add(temp.substring(0,temp.length()-2));
				
			}
			else if(temp.contains("=")) {
				words.add(temp.replaceAll("=", ""));
			}
			else if(temp.contains(";")) {
				words.add(temp.replaceAll(";", ""));
			}
			else if(temp.contains("!")) {
				words.add(temp.replaceAll("!", ""));
			}
			
			else if(temp.charAt(0) == 'A') {
				words.add(temp);
			}
			else if(temp.charAt(0) == 'I') {
				words.add(temp);
			}
			else if(temp.length() != 1) {
				words.add(temp);
			}
		}

		public static void read(Scanner s) { //Method that reads the whole PersonOfTheCentrury.txt file and sees what and what not to add
			String temp = "";
			temp = s.next().trim();


			while(s.hasNext()) {


					saving(words, temp);
					
				temp = s.next().trim();
			}
			//Sorting
			words.sort(String::compareToIgnoreCase); 
			

			//Remove Duplicates
			Object[] stA = words.toArray();
			for (Object str : stA) {
				if (words.indexOf(str) != words.lastIndexOf(str)) {
					words.remove(words.lastIndexOf(str)).trim();
					
				}
			}
		
			
			
			//PersonOfTheCentury.txt

			
			
		
			
		}

		public static void writer(PrintWriter p) { //Method which writes what we added from the read() method to the output file 
			String s;
			char c = 'A';
			char c1;
			p.println("The document produced this sub-dictionary, which includes " +words.size()+ " entries.");
			p.println("A");
			p.println("==");
			
			for(int i = 1 ; i < words.size(); i++) {
				
				s = words.get(i).trim();
				
				c1 = s.charAt(0);
				
				if(c1 != c) {
					p.println("\n"+ c1);
					p.println("==");
					c = c1;
				}
				
				p.println(words.get(i).trim());
				
				
			}
		}
	}

