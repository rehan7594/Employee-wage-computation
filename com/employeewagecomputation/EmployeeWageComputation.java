package com.employeewagecomputation;
 
public class EmployeeWageComputation {

	public static void main(String[] args) {
	
	
	//constant variable
	int IS_FULL_TIME = 1;
	
	//to generate value 0 or 1
	double empCheck = Math.floor(Math.random()*10) % 2;
	
	//checking if employee is present or absent
	if(empCheck == IS_FULL_TIME)
	{
		System.out.println("employee is present");
	}
	else
		System.out.println("employee is absent");
	
	}	
}

