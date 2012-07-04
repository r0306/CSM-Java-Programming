package Lab4;

/**
* @Author: Robert Lu
* @Email: robertlu99@yahoo.com
* @Course: CIS 254
* @Class: G00926921_Lab4
* @Purpose: Use the JOptionPane to display an input field to enter a number and process its digit distribution.
* @Usage: Run the class file in the debug console and enter information in the input panels.
* @Lab Number: 4
* @Date: 7/3/2012
*/


import javax.swing.JOptionPane;

public class G00926921_Lab4
{
	
	static String name = "";
	static String numberString = "";
	static int num = 0;

	public static void main(String[] args)
	{
		
		name = JOptionPane.showInputDialog("Please enter your name:");
	
		numberString = JOptionPane.showInputDialog("Hi " + name + ". Please enter a three-digit number:");
		
		while(toInt(numberString) == -1 || !digitCheck(toInt(numberString)));
		calculatePlace(num);
		
	}
		
	public static int toInt(String number)
	{
		
		try
		{
						
			return Integer.parseInt(number);
			
		} catch (NumberFormatException e) {
		
			rePromptNumber(true);
	
		}
		
		return -1;
		
	}
	
	public static boolean digitCheck(int number)
	{

		num = number;
		return number < 100 || number > 999 ? rePromptNumber(false) : true;
		
	}
	
	public static boolean rePromptNumber(boolean reason)
	{
		
		if (reason)
			numberString = JOptionPane.showInputDialog("That wasn't a number. Please enter a number:");
		else
			numberString = JOptionPane.showInputDialog("That wasn't three digits. Please enter a three-digit number:");

		toInt(numberString);
		
		return false;

	}
		
	public static void calculatePlace(int number)
	{
		
		int hundred = (number % 1000) / 100;
		int tenth = (number % 100) / 10;
		int ones = (number % 10);
		
		JOptionPane.showMessageDialog(null, "Programmed by: Robert Lu. \nYour name is: " + name + "." +
									  "\nThe number you entered was: " + num + ". \nThe digit distribution is as follows: " +
									  "\nHundredth: " + hundred + " \nTenth: " + tenth + " \nOnes: " + ones);
		
	}
	
	
}
