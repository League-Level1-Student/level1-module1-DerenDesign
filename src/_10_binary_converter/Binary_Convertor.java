package _10_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Binary_Convertor implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("convert");
	JTextField answer = new JTextField(20);
	JLabel label = new JLabel();
	public void showJFrame() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		panel.add(answer);
		panel.add(label);
		frame.pack();
		button.addActionListener(this);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String answer1 = answer.getText();
		String x = convert(answer1);
		label.setText(x);
		frame.pack();
		
	}
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}

}
