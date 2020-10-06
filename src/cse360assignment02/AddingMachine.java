package cse360assignment02;

/**
 * AddingMachine.java
 * Implements a rudimentary calculator.
 * @author cjsturgess (Christopher Sturgess 1214841745)
 *
 * Link: https://github.com/cjsturgess/CSE360
 * Access: It's a public link.
 */

public class AddingMachine {
	
	/**
	 * Private Variables
	 */
	private int total;
	private String history;
	 
	/**
	 * Constructor
	 */
	public AddingMachine () {
		total = 0;
		history = "0";
	}
	 
	
	/**
	 * Get current total from machine
	 * @return current total
	 */
	public int getTotal () {
		return this.total;
	}
	  
	
	/**
	 * Add values to the machine.
	 * @param value how much to add
	 */
	public void add (int value) {
		this.history += " + " + value;
		
		this.total += value;
	}

	
	/**
	 * Subtracts amount from current machine.
	 * @param value how much to subtract
	 */
	public void subtract (int value) {
		this.history += " - " + value;
		
		this.total -= value;
	}

	
	/**
	 * String representation of the history of the adding machine.
	 * @returns calculator history
	 */
	public String toString () {
	  return this.history;
	}
	

	/**
	 * Clears the adding machine by resetting the history setting total to 0.
	 */
	public void clear() {
		this.total = 0;
		this.history = "0";
	}
}
