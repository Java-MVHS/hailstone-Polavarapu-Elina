// Elina Polavarapu
// 11/5/25
// Hailstone.java
// This program takes a number from user input and prints the hailstone sequence
// Working on: While loops, for loops, do while loops
/// Testing plan:
/// 20 - should get the numbers 20, 10, 5, 16, 8, 4, 2, 1
/// 30 - should get the numbers 30, 15, 46, 23, 70, 35, 106, 53, 160, 80, 40,
/// 	20, 10, 5, 16, 8, 4, 2, 1
/// 1 - should get just 1
/// -3 - should get error
/// -1 - should exit the program

/*
 * Pseudocode: see paper 
 */

import java.util.Scanner;

public class Hailstone
{
	private int input; // this is the number the user inputs
	private int count; // this stores the number of times the loop ran
	
	public Hailstone()
	{
		input = 0;
		count = 1;
	}
	
	/* This makes an instance of Hailstone and calls findIt()
	 */
	public static void main (String[] args)
	{
		Hailstone sequence = new Hailstone();
		sequence.findIt();
	}
	
	/* uses a do while loop
	 * calls input, resets count, checks that input is in the correct range,
	 * calls printSequence(), calls printCount(), and checks that input is not -1
	 */
	public void findIt()
	{
		System.out.println("\n\n\n");
		System.out.println("Welcome to Hailstone!");
		do
		{
			getInput();
			count = 1;
			if (input > 0 && input <= 10000)
				printSequence();
			printCount();
		} while (input != -1);
	}
	
	/* makes instance of Scanner, prints welcome and prompt, gets input
	 */
	public void getInput()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("\n\nEnter a positive integer ( 1 - 10000 ). To quit, " +
			"enter -1: ");
		input = kb.nextInt();
	}
	
	/* prints out input, then uses a while to execute while input != 1
	 * increments count, checks if input is divisible by two, if it is
	 * divides by two, if not multiply by 3 and add 1
	 * then prints input. If count is a multiple of 10, prints a new line
	 */
	public void printSequence()
	{
		System.out.printf("\n%7d", input);
		while(input != 1)
		{
			count ++;
			if(input % 2 == 0)
				input = input/2;
			else
				input = input*3 +1;
			
			System.out.printf("%7d", input);
			if(count % 10 == 0)
				System.out.println();
		}
	}
	
	/* based on vales of input, prints # of times the loop executed, 
	 * thank you message, or error message
	 */
	public void printCount()
	{
		if (input == 1)
			System.out.printf("\n\nThe loop executed %d times.\n", count);
		else if (input == -1)
			System.out.println("\nThank you for playing Hailstone.\n\n\n");
		else
			System.out.println("\nEnter a value within the range, please!");
		
	}
}
