package com.javaConditionalStatement;

public class Example6 {

	public static void main(String[] args) {
		
		/**
		 * Write a java program to print the day is working day/weekday 
		 * or holiday/weekend based given input.
		 * 
		 * Note: Use switch-case conditional statement to complete this task.
		 */
		
		String day = "sunday".toLowerCase();
		
		switch(day)
		{
			case "monday":
				System.out.println("Weekday or Working Day");
				break;
					
			case "tuesday":
				System.out.println("Weekday or Working Day");
				break;
				
			case "wedesday":
				System.out.println("Weekday or Working Day");
				break;
				
			case "thursday":
				System.out.println("Weekday or Working Day");
				break;
				
			case "friday":
				System.out.println("Weekday or Working Day");
				break;

			case "saturday":
				System.out.println("Weekend or Holiday");
				break;
				
			case "sunday":
				System.out.println("Weekend or Holiday");
				break;
				
			default:
				System.out.println("enter valid day");
				
		}
		
	}

}
