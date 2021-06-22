package com.bridgelabz;

import com.sun.org.apache.bcel.internal.generic.DADD;

public class EmployeeWageComputation {
	public static void main(String args[]) {
		System.out.println("Welcome to wage computation problem");
		int IS_FULLTIME_PRESENT = 1;
		int IS_PARTTIME_PRESENT = 2;
		int WAGE_PER_DAY = 20;
		int FULL_DAY = 8;
		int PART_TIME = 4;
		int DAILY_WAGE = 0;
		double empCheck = Math.floor(Math.random() * 10 ) % 3;
		System.out.println(empCheck);
		
		if (empCheck == IS_FULLTIME_PRESENT)
		{
			DAILY_WAGE = WAGE_PER_DAY * FULL_DAY;
			System.out.println("Employee is present for full day");
			System.out.println("Employee Daily wage for full day is :"+DAILY_WAGE);
		}
		else if (empCheck == IS_PARTTIME_PRESENT)
		{
			DAILY_WAGE = WAGE_PER_DAY * PART_TIME;
			System.out.println("Employee is present for part time");
			System.out.println("Employee daily wagefor part time is :"+DAILY_WAGE);
		}
		else
		{
			System.out.println("Employee is absent");
		}
	}
}
