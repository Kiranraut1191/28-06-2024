package com.javaConditionalStatement;

public class Example7 {

	public static void main(String[] args) {
		
		/**
		 * Write a java program to print the day is working day/weekday 
		 * or holiday/weekend based given input.
		 * 
		 * Note: Use switch-case conditional statement to complete this task.
		 */
		
		String day = "tuesday".toLowerCase();
		
		switch(day)
		{
			case "monday":
			case "tuesday":
			case "wedesday":
			case "thursday":
			case "friday":
				System.out.println("Weekday or Working Day");
				break;

			case "saturday":
			case "sunday":
				System.out.println("Weekend or Holiday");
				break;
				
			default:
				System.out.println("enter valid day");
				
		}
		
	}

}
