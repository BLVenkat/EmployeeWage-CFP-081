package com.bridgelabz.employeewage;

public class EmployeeWageComputation {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int WAGE_PER_HOUR = 20;
	
	public static void main(String[] args) {
		
		int empHrs=0;
		int empWage;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		
		if(empCheck == IS_FULL_TIME) 
			empHrs=8;
		
		else if (empCheck == IS_PART_TIME) 
			empHrs=4;
		
		empWage = empHrs*WAGE_PER_HOUR;
		System.out.println("Employee Daily Wage: " +empWage);

	}
	
	
}
