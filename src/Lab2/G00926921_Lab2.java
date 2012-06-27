package Lab2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
* @Author: Robert Lu
* @Email: robertlu99@yahoo.com
* @Course: CIS 254
* @Class: G00926921_Lab2
* @Purpose: This class makes use of the Scanner object to get input from the user and process information entered by them.
* @Usage: Run the class file in the console and follow the on-screen instructions.
* @Lab Number: 2
* @Date: 6/26/2012
*/

public class G00926921_Lab2 
{
	
	
	
	public static void main (String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		String name = promptName(input);
		
		greetCustomer(name);
		
		while (!tryInteger(new Scanner(System.in)));

	
	}
	
	public static boolean tryInteger(Scanner input)
	{
		
		try
		{
		
			int number = promptInteger(input);
			processInteger(number);
			return true;
		
		} catch (InputMismatchException e) {
			
			System.out.println("No, silly. Please input an integer. :)");
			System.out.println("Let's try this again.");

		}
		
		return false;
		
	}
	
	public static String promptName(Scanner input)
	{
		
		System.out.println("Welcome. Please enter your name:");
		
		return input.next();
		
	}
	
	public static void greetCustomer(String name) //Just kidding. Not actually our customer.
	{
		
		System.out.print("Nice to meet you, ");
		System.out.println(name + ".");
		
	}
	
	public static Integer promptInteger(Scanner input)
	{
		
		System.out.println("Please enter an integer:");
		
		return input.nextInt();
		
	}
	
	public static void processInteger(int number)
	{
		
		if (number > 100)
		System.out.printf("Your number, %d, is greater than 100.", number);
		else if (number == 100)
		System.out.printf("Your number, %d, is equal to 100.", number);
		else
		System.out.printf("Your number, %d, is less than 100.", number);
		
	}

}
