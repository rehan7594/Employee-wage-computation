package com.employeewagecomputation;
 
public class EmployeeWageComputation {

	public static void main(String[] args) 
	{
	
	//Constant 
	int IS_FULL_TIME = 1;
	int EMP_RATE_PER_HOUR = 20;
	
	//Variables
	int empHrs = 0;
	int empWage = 0;
	
	//to generate value 0 or 1
	double empCheck = Math.floor(Math.random()*10) % 2;
	
	//checking if employee is present or absent
	if(empCheck == IS_FULL_TIME)
		empHrs = 8;
	else
		empHrs = 0;
	
	empWage = empHrs * EMP_RATE_PER_HOUR;
	System.out.println( "Emp Wage: "+ empWage);

	}	
}

