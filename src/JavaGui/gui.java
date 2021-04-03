package JavaGui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.*;

public class gui {

	public static void main(String[] args) {
		
		int total = 0;
		String num1 = JOptionPane.showInputDialog("First number to add");
		String num2 = JOptionPane.showInputDialog("Second number to add");
		
		Pattern p = Pattern.compile("[A-Z,a-z,&%$#@!()*^]");
		
		Matcher m = p.matcher(num1);
		Matcher m2 = p.matcher(num2);
		
		if (m.find() ) {
	    // JOptionPane.showMessageDialog(null, "Invalid first number please enter another number");
	     num1 = JOptionPane.showInputDialog("Invalid first number.Please enter another number");
		}
		
		if (m2.find() ) {
		  //   JOptionPane.showMessageDialog(null, "Invalid first number please enter another number");
			num2 = JOptionPane.showInputDialog("Invalid second number.Please enter another number");
			}
		
		
	  total = Integer.parseInt(num1)  +  Integer.parseInt(num2);
	  
      JOptionPane.showMessageDialog(null, "The reults of the addition of:  "+ num1 + " and:  "+ num2 + " is "+ total);
		
	}

}
