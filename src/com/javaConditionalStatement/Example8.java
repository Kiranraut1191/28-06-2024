package com.javaConditionalStatement;

public class Example8 {

	public static void main(String[] args) {
		
		/**
		 * Write a java program to print the day is working day/weekday 
		 * or holiday/weekend based given input.
		 * 
		 * Note: Use switch-case conditional statement to complete this task.
		 */
		
		String day = "mayday".toLowerCase();
		
		String output = switch(day)
		{
			case "monday", "tuesday", "wedesday", "thursday", "friday" ->  "Weekday or Working Day";
			case "saturday", "sunday" ->  "Weekend or Holiday";
				
			default -> "enter valid day";
				
		};
		
		System.out.println(output);
		
	}

}
