package com.javaConditionalStatement;

public class Example4 {

	public static void main(String[] args) {
		
		/**
		 * Write a java program to verify the given number is positive or negative,
		 * if it is positive then verify again the number is an even or odd.
		 * 
		 * Note: Use nested if-else statement
		 */
		
		int number = 97;
		
		if(number > 0)//positive or negative
		{
			System.out.println("the number is positive");
			
			if(number%2 == 0)//even or odd
			{
				System.out.println("the number is an even");
			}
			else
			{
				System.out.println("the number is an odd");
			}
		}
		else
		{
			System.out.println("the number is negative");
		}

	}

}
