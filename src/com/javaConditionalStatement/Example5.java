package com.javaConditionalStatement;

public class Example5 {

	public static void main(String[] args) {
		
		/**
		 * Write a java program to provide a grade system to the student, 
		 * based the marks scored out off 100 by the student. use else-if ladder
		 * statement.
		 * 
		 * Note: 100-75 - Distinction
		 * 		 74-60 - First class
		 * 		 59-50 - Second class
		 * 		 49-41 - Third class
		 * 		 40    - pass
		 * 		 below 40 - fail
		 */
		
		int marks = 76;
		
		if(marks <= 100 && marks >= 75)
		{
			System.out.println("First Class With Distinction");
		}
		else if(marks <= 74 && marks >= 60)
		{
			System.out.println("First Class");
		}
		else if(marks <= 59 && marks >= 50)
		{
			System.out.println("Higher Second class");
		}
		else if(marks <= 49 && marks >= 41)
		{
			System.out.println("Second Class");
		}
		else if(marks == 40)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}

	}

}
