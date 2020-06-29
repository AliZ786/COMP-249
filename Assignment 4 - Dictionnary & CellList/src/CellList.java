// -----------------------------------------------------
// Assignment 4
// Question 1
// Written by: Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
// -----------------------------------------------------


/**
 * Names: Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
// Comp 249- Fall 2019 Section E
// Assignment : #4 Q2
// Due Date: Monday, December 2nd 2019
 */

public class CellList implements Cloneable {

	//Inner Class
	//-------------------------------------------------
	private class CellNode implements Cloneable{
		private CellPhone cp;
		private CellNode next;

		public CellNode() {
			cp =  null;
			next = null;
		}
		public CellNode(CellPhone c1, CellNode c2) {
			this.cp = c1;
			this.next = c2;
		}

		public CellNode(CellNode c) {

			this.next = c.next;
		}

		//Clone Method for the inner class
		public Object clone() {
			return new CellNode(this);
		}
		//Accessors and Mutators for the inner class
		public CellPhone getCp() {
			return cp;
		}
		public void setCp(CellPhone cp) {
			this.cp = cp;
		}
		public CellNode getNext() {
			return next;
		}
		public void setNext(CellNode cn) {
			this.next = cn;
		}

	}
	//End of Inner Class

	
	/**
	 * Start of the outer class
	 */
	private CellNode head;
	private int size;

	public CellList() { //Default constructor
		head = null;
		size = 0;
	}

	public CellList(CellList cl) { //Copy constructor 

		if(cl == null)
			throw new NullPointerException();
		if(cl.head == null)
			head = null;
		else {
			head = copyList(cl.head);
		}

	}

	public CellList clone() { //Clone method to clone the CellList
		try {
			CellList newCL = (CellList) super.clone();
			if(head == null)
				newCL.head = null;
			else
				newCL.head = copyList(head);
			return newCL;
		}
		catch(CloneNotSupportedException e) {
			return null;
		}
	}

	private CellNode copyList(CellNode cnl) {//Due to privacy could be only used in outer class
		CellNode temp = cnl;
		CellNode newHead = null;
		CellNode end = null;

		newHead = new CellNode((CellPhone)(temp.cp).clone(), null);

		end = newHead;
		temp = temp.next;

		while(temp != null) {
			end.next = new CellNode((CellPhone)(temp.cp).clone(), null);
			end = end.next;
			temp = temp.next;
		}
		return newHead;

	}

	public void addToStart(CellPhone i) { //Would add a value to the start of the list (head node)

		CellNode n = new CellNode(i, head);
		head = n;
		n = null;
	}

	public void insertAtIndex(int i, CellPhone x) throws NoSuchElementException { //Would add a value at the mentioned index
		int index = 0;
		if(head == null) { //Would go here if list is empty 
			System.out.println("\nList is empty. " + i + " cannot find in list");
			throw new NoSuchElementException();

		}

		if( index == i) { //Would go here if list is not empty and the index does exist 
			head = new CellNode(x, head);
			System.out.println("Added at index " + i);
			return;
		}
		CellNode t = head;
		while(t != null && index != i) {

			index++;

			if(t.next == null) { //Would go here when there is no such index in the list 
				System.out.println(i + " cannot find in list");
				throw new NoSuchElementException();
			}

			if(index == i) {
				t.next = new CellNode(x, t.next);
				System.out.println("Added at index " + i);
			}
			t=t.next;
		}

	}

	public void deleteFromIndex(int a) throws NoSuchElementException {

		if (head == null) { //Empty list 
			System.out.println("List is empty");
			throw new NoSuchElementException();
		}
		// Store head node 
		CellNode temp = head; 

		// If head needs to be removed 
		if (a == 0) 
		{ 
			head = temp.next;   // Change head 
			System.out.println("Deleted at " + a);
			return; 
		} 

		// Find previous node of the node to be deleted 
		for (int i=0; temp!=null && i<a-1; i++) 
			temp = temp.next; 

		if (temp == null || temp.next == null) 
			return; 


		CellNode next = temp.next.next;
		System.out.println("Deleted at " + a);

		temp.next = next;  // Unlink the deleted node from list 
	}
	
	public void deleteFromStart() throws NoSuchElementException {
		if(head == null) {
			System.out.println("List is empty");
			throw new NoSuchElementException();
		}
		head = head.next;   // Change head and will delete 
		System.out.println("Deleted at 0");
		return; 
	}
	
	public void replaceAtIndex(int i, CellPhone c) throws NoSuchElementException {
		
		int index = 0;
		if(head == null) { //Empty list 
			System.out.println("\nList is empty. " + i + " cannot find in list");
			throw new NoSuchElementException();

		}

		if( index == i) {//If not empty , and index exists
			head = new CellNode(c, head.next);
			System.out.println("Replaced at index " + i);
			return;
		}
		CellNode t = head;
		
		while(t != null && index != i) {

			index++;

			if(t.next == null) { //Index not found 
				System.out.println(i + " cannot find in list");
				throw new NoSuchElementException();
			}

			if(index == i) {
				t.next = new CellNode(c, t.next);
				System.out.println("Replaced at index " + i);
			}
			
			t=t.next;
		}
		
		CellNode t2=head;
		for (int j=0; t2!=null && j<i; j++) 
			t2 = t2.next; 

		if (t2 == null || t2.next == null) 
			return; 


		CellNode next = t2.next.next;
		

		t2.next = next; 
		
	}
	
	
	public CellNode find(Long sn) { //Method which will find if serial number exists in the list 
		int counter = 0;
		if (head == null) {
			System.out.println("List is empty");
			return null;
		}
		
		CellNode pointer = head;
		while(pointer != null) {
			if(pointer.cp.getSerialNum() == sn) { //If serial number is found
				System.out.println("Serial number: " + sn + " was found. " +"Number of Iterations before " + sn + " was found " + counter );
				return pointer;
			}
			pointer=pointer.next;
			counter++;
		}
		System.out.println("Serial number: " + sn +" was not found");
		return null;
	}
	
	public boolean contains(long sn) { //Methods to see if the list contains a certain serial number 
		if (head == null) {
			System.out.println("List is empty");
			
			return false;
		}
		
		CellNode pointer = head;
		while(pointer != null) {
			if(pointer.cp.getSerialNum() == sn) {
				
				return true;
			}
			pointer=pointer.next;
		
		}
		
		return false;
	}


	public void showContents() {
		CellNode temp = head;
		if(temp == null) // If list is empty 
			System.out.println("Nothing to display");
		else {
			System.out.println("\nThe current size of the list is " + length() + ". Here are the contents of the list "); // Prints size of the list 
			System.out.println("=============================================================================");
		}
		int count =0;
		while(temp != null) {
			if(count == 3) {
				System.out.println();
				count = 0;
			}

			System.out.print(temp.cp + " ----> ");
			count++;

			temp = temp.next;

		}
		System.out.println("X");
		System.out.println();
	}
	
	public int length() { //Determines size of the list 
		size = 0;
		CellNode t = head;
		while(t != null) {
			size++;
			t = t.next;
		}
		return this.size;
	}
	
	public boolean equals(CellList c) { //Equal method for the list 
		if(this == c) {
			return true;
		}
		if(c instanceof CellList) {
			CellList cl = (CellList) c;
			int n = length();
			if(n == cl.length()) {
				CellNode n1 = head;
				CellNode n2 = cl.head;
				while(n1 != null) {
					if((n1.cp.getBrand() != n2.cp.getBrand()) && (n1.cp.getPrice() != n2.cp.getPrice()) && (n1.cp.getYear() != n2.cp.getYear())) {
						return false;
					}
					n1 = n1.next;
					n2 = n2.next;
				}
				return true;
			}
		}
		return false;
	}

}
