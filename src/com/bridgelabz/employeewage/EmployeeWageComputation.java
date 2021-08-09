package com.bridgelabz.employeewage;

public class EmployeeWageComputation {

	public static final int IS_PRESENT = 1;
	public static final int WAGE_PER_HOUR = 20;
	
	public static void main(String[] args) {
		
		int empHrs=0;
		int empWage=0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		
		if(empCheck == IS_PRESENT) {
			empHrs=8;
		}
		empWage = empHrs*WAGE_PER_HOUR;
		System.out.println("Employee Daily Wage: " +empWage);

	}
	
	
}
