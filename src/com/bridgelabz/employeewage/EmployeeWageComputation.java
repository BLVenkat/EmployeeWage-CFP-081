package com.bridgelabz.employeewage;

public class EmployeeWageComputation {

	public static final int IS_PRESENT = 1;
	
	public static void main(String[] args) {
		
		double empCheck = Math.floor(Math.random() * 10) % 2;
		
		if(empCheck == IS_PRESENT) {
			System.out.println("Employee Is Present");
		}
		else {
			System.out.println("Employee is absent");
		}

	}
	
	
}
