package com.Emp_Wage;

public class EmpWageOOP {

	public static void Emp_Check() {

		int empType = (int) (Math.random() * 10) % 2;

		if (empType == 1) {

			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
		}

	}
         public static void main(String args[]) {
		Emp_Check();
	}
}
