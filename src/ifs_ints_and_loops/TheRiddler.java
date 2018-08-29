package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle = JOptionPane.showInputDialog(null,
				"If you have me, you want to share me.\n If you share me, you haven't got me. \nWhat am I? ");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (riddle.equalsIgnoreCase("Secret")) {
			JOptionPane.showMessageDialog(null, "Correct!", riddle, score + 1);
			score += 1;

		} else {
			JOptionPane.showMessageDialog(null, "Wrong.\n Secret");

			// 5. Otherwise, say "wrong" and tell them the answer

			// 6. Add some more riddles
			String riddle2 = JOptionPane.showInputDialog(" What gets broken without being held? ");

			if (riddle2.equalsIgnoreCase("Promise")) {
				JOptionPane.showMessageDialog(null, "Correct!", riddle2, score + 1);
				score += 1;

			} else {
				JOptionPane.showMessageDialog(null, "Wrong.\n Promise");

				// 2. Make a pop up to show the score.
				JOptionPane.showMessageDialog(null, score);
			}
		}
	}
}