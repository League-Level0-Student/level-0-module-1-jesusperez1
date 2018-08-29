package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

/*
* Everyone has a super power. Mine is writing recipes. This program will store
* the super powers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's super power is writing recipes".
*/
public class XGeeks {
	public static void main(String[] args) {

		// 1. Save the super power for each person in a variable.
		String superpower = JOptionPane.showInputDialog(null," Enter a super power. ");
		String superpower1 = JOptionPane.showInputDialog(null,"Enter a super power. ");
		String superpower2 = JOptionPane.showInputDialog(null, "Enter a super power. ");
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String name = JOptionPane.showInputDialog(null, "Enter your name.");
		// 3. Show the super power in a pop-up, depending on the name entered.
		if (name.equalsIgnoreCase("Superman")) {
			JOptionPane.showMessageDialog(null, superpower);

		} 		
		else if (name.equalsIgnoreCase("Flash")) {
			JOptionPane.showMessageDialog(null, superpower1);

		}
		else if (name.equalsIgnoreCase("Poseidon")) {
			JOptionPane.showMessageDialog(null, superpower2);
		}
		
		else {
			JOptionPane.showMessageDialog(null, "You shall stay mortal!!!");
		}
	}
}
