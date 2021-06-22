package com.bridgelabz;

public class EmployeeWageComputation {
	public static final int IS_FULLTIME_PRESENT = 1;
	public static final int IS_PARTTIME_PRESENT = 2;
	public static final int MAX_HOURS_ALLOWED = 100;
	public static final int DAYS_IN_A_MONTH = 20;
	public static final int WAGE_PER_DAY = 20;
	
	public static void main(String args[]) {		
		int TOTAL_WORKING_HOURS = 0;
		int TOTAL_WORKING_DAYS = 0;
		int MONTHLY_WAGE = 0;
		
		while(TOTAL_WORKING_HOURS<MAX_HOURS_ALLOWED && TOTAL_WORKING_DAYS<DAYS_IN_A_MONTH){
			
			int DAILY_WAGE = 0;
			TOTAL_WORKING_DAYS++;
			int EMP_HOURS=0;
			
			double empCheck = Math.floor(Math.random() * 10 ) % 3;			
			switch ((int)empCheck) {
			case IS_FULLTIME_PRESENT : 
				EMP_HOURS = 8;
				break;
				
			case IS_PARTTIME_PRESENT :
				EMP_HOURS = 4;
				break;
			
			default:
				EMP_HOURS = 0;
			}
			DAILY_WAGE = WAGE_PER_DAY * EMP_HOURS;
			TOTAL_WORKING_HOURS += EMP_HOURS;
			MONTHLY_WAGE = MONTHLY_WAGE + DAILY_WAGE;
		}
		System.out.println("Total Working Days :"+TOTAL_WORKING_DAYS);
		System.out.println("Total Wokking hours :"+TOTAL_WORKING_HOURS);
		System.out.println("Monthly employee wage :"+MONTHLY_WAGE);
	}
}
