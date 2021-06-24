package com.bridgelabz;

public class EmployeeWageComputation {
	public static final int IS_FULLTIME_PRESENT = 1;
	public static final int IS_PARTTIME_PRESENT = 2;
	public static final int MAX_HOURS_ALLOWED = 100;
	public static final int DAYS_IN_A_MONTH = 20;
	public static final int WAGE_PER_DAY = 20;
	
	public static void main(String args[]) {		
		int total_working_hours = 0;
		int total_working_days = 0;
		int monthly_wage = 0;
		
		while(total_working_hours<MAX_HOURS_ALLOWED && total_working_days<DAYS_IN_A_MONTH){
			
			int daily_wage = 0;
			total_working_days++;
			int emp_hours=0;
			
			double empCheck = Math.floor(Math.random() * 10 ) % 3;			
			switch ((int)empCheck) {
				case IS_FULLTIME_PRESENT : 
					emp_hours = 8;
					break;
					
				case IS_PARTTIME_PRESENT :
					emp_hours = 4;
					break;
				
				default:
					emp_hours = 0;
				}
			daily_wage = WAGE_PER_DAY * emp_hours;
			total_working_hours += emp_hours;
			monthly_wage = monthly_wage + daily_wage;
		}
		System.out.println("Total Working Days :"+total_working_days);
		System.out.println("Total Wokking hours :"+total_working_hours);
		System.out.println("Monthly employee wage :"+monthly_wage);
	}
}
