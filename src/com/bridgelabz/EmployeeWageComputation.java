package com.bridgelabz;

public class EmployeeWageComputation {
	public static void main(String args[]) {
		System.out.println("Welcome to wage computation problem");
		int IS_PRESENT = 1;
		int WAGE_PER_DAY = 20;
		int FULL_DAY = 8;
		int DAILY_WAGE = 0;
		double empCheck = Math.floor(Math.random() * 10 ) % 2;
		System.out.println(empCheck);
		
		if (empCheck == IS_PRESENT)
		{
			DAILY_WAGE = WAGE_PER_DAY * FULL_DAY;
			System.out.println("Employee is present");
			System.out.println("Employee Daily wage for full day is :"+DAILY_WAGE);
		}
		else
		{
			System.out.println("Employee is absent");
		}
	}
}
