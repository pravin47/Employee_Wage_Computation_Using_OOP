package com.Emp_Wage;

class Emp_Daily_Wage {

	public static void Daily_Wage() {
		int Wage_Per_Hr = 20;
		int Full_Day_Hr = 8;
		int Wage = Wage_Per_Hr * Full_Day_Hr;
		System.out.println("Employee Daily Wage is :" + Wage);
	}

	public static void Part_Time() {
		int Part_time_hr = 8;
		int Part_Time_Wage = 20;
		int partTimeWage = Part_time_hr * Part_Time_Wage;
		System.out.println("Employee Part time Wage is :" + partTimeWage);
	}
}

public class Emp_Wage_OOP extends Emp_Daily_Wage {

	public static void Emp_Check() {

		int empType = (int) (Math.random() * 10) % 3;

		if (empType == 1) {
			System.out.println("Employee is present");
			Daily_Wage();
		} else if (empType == 2) {
			System.out.println("Employee is part time");
			Part_Time();
		} else {
			System.out.println("Employee is absent");
		}
	}

	public static void main(String args[]) {
		Emp_Check();
	}

}

