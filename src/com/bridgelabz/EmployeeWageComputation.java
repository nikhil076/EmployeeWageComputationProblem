package com.bridgelabz;

public class EmployeeWageComputation {
	public static void main(String args[]) {
		System.out.println("Welcome to wage computation problem");
		int IS_PRESENT = 1;
		double empCheck = Math.floor(Math.random() * 10 ) % 2;
		System.out.println(empCheck);
		
		if (empCheck == IS_PRESENT)
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("Employee is absent");
		}
	}
}
