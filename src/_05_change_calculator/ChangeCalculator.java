package _05_change_calculator;
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
      String bob=  JOptionPane.showInputDialog("how many nickels do you have");
		// Ask the user how many nickels they have
   double nickels = Integer.parseInt(bob);
        
		// Convert their answer to an int using Integer.parseInt()
      String baob= JOptionPane.showInputDialog("how many dimes do you have");
		// Ask the user how many dimes they have, and convert their answer
    double dimes = Integer.parseInt(baob);
		// Ask the user how many quarters they have, and convert their answer
     String baoob= JOptionPane.showInputDialog("how many quarters do you have");
		// Calculate how much money the user has and save it in a double variable 
    double quarters = Integer.parseInt(baoob);
      
		// Tell the user how much money they have
      double money = nickels/20 + dimes/10 + quarters/4;
      JOptionPane.showMessageDialog(null, money);
	}
}

