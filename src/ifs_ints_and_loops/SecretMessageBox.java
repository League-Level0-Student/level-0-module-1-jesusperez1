package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class SecretMessageBox {
	public static void main(String[] args) {
		String password = "Pizza";
		String secret = JOptionPane.showInputDialog(null, " Enter a secret. ");
		String secretword = JOptionPane.showInputDialog(null,
				"You may only see the message \n if you guess the password");
		if (secretword.equalsIgnoreCase("Pizza")) {
			JOptionPane.showMessageDialog(null, secret);
		} else {
			JOptionPane.showMessageDialog(null, "INTRUDER!!!");
		}
	}
}
