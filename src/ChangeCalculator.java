//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String answer1 = JOptionPane.showInputDialog("How many nickels u got my dude?");
		// Convert their answer to an int using Integer.parseInt()
int Nickles = Integer.parseInt(answer1);
		// Ask the user how many dimes they have, and convert their answer
String answer2 = JOptionPane.showInputDialog("How many dimes u got my dude?");
int Dimes = Integer.parseInt(answer2);
		// Ask the user how many quarters they have, and convert their answer
String answer3 = JOptionPane.showInputDialog("How many quarters u got my dude?");
int Quarters = Integer.parseInt(answer3);
		// Calculate how much money the user has and save it in a double variable 
double money = (Nickles * 0.05 + Dimes * 0.10 + Quarters * 0.25);
		// Tell the user how much money they have
if (money <= 0) {
	JOptionPane.showMessageDialog(null, "You have no money");
}
else {
	JOptionPane.showMessageDialog(null, "You have $ " + money);
}
	}
}

