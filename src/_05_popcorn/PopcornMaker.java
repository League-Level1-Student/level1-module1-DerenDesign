package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	Microwave microwave = new Microwave();
	String flavor = JOptionPane.showInputDialog("What kind of flavor do you want?");
	Popcorn popcorn = new Popcorn(flavor);
	microwave.putInMicrowave(popcorn);
	
	
	String answer1 = JOptionPane.showInputDialog("How many minutes do you want it cooked for");
	int cookTimeInMinutes = Integer.parseInt(answer1);
	microwave.setTime(cookTimeInMinutes);
	microwave.startMicrowave();
	
	
}
}
