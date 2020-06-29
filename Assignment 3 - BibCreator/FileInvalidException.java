// -----------------------------------------------------
// Assignment 3
// Question 1
// Written by: Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
// -----------------------------------------------------


/**
 * Names: Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
// Comp 249- Fall 2019 Section E
// Assignment : #3
// Due Date: Monday, November 18th 2019
 */






public class FileInvalidException extends Exception {
String s = "";
	
	public FileInvalidException() {
		s = "Error: Input file cannot be parsed due to missing information";
	}
	
	public FileInvalidException (String s) {
		super(s);
	}
	
	public FileInvalidException (int i) {
		super("Problem detected with input file: Latex" + i + ".bib");
	}
	
	public String getMessage() {
		return s;
	}
}



