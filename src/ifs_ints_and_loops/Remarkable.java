package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(null, " Enter your name. ");
		if (name.equalsIgnoreCase("Nef")) {
			JOptionPane.showMessageDialog(null, "You are a pleasure to be around.");

		} else if (name.equalsIgnoreCase("Dan")) {
			JOptionPane.showMessageDialog(null, "You are an awesome person!");

		} else if (name.equalsIgnoreCase("Jerry")) {
			JOptionPane.showMessageDialog(null, "You make others laugh.");
		}

		else {
			JOptionPane.showMessageDialog(null, "Who are you?");
		}
	}
}
