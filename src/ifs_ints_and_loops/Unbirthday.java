package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String birthday= JOptionPane.showInputDialog(null, "What is your birthday? (mm/dd)");
		if(birthday.equals("08/16")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		}else {
			JOptionPane.showMessageDialog(null,"I wish you a merry UNBIRTHDAY");
			
			
		}
		
	}
}
