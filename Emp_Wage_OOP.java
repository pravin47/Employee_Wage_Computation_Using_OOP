package com.Emp_Wage;

class Emp_Daily_Wage {

	public static void Full_Time() {
		int Wage_Per_Hr = 20;
		int Full_Day_Hr = 8;
		int Working_Day = 20;
		int Wage = Wage_Per_Hr * Full_Day_Hr;
		int Wage_per_Month = ((Wage_Per_Hr * Full_Day_Hr) * Working_Day);
		System.out.println("Employee is Present ");
		System.out.println("Employee Daily Wage is :" + Wage);
		System.out.println("Employee monthly Wage is :" + Wage_per_Month);
	}

	public static void Part_Time() {
		int Part_time_hr = 8;
		int Part_Time_Wage = 20;
		int Working_Day = 20;
		int partTimeWage = Part_time_hr * Part_Time_Wage;
		int Wage_per_Month = ((Part_time_hr * Part_Time_Wage) * Working_Day);
		System.out.println("Employee Part time Wage is :" + partTimeWage);
		System.out.println("Employee monthly Wage is :" + Wage_per_Month);
	}

	public static void Absent() {

		System.out.println("Employee is Absent");
	}
}

public class Emp_Wage_OOP extends Emp_Daily_Wage {

	public static void main(String args[]) {
		int empType = (int) (Math.random() * 10) % 3;
		switch (empType) {
		case 1:
			Full_Time();
			break;
		case 2:
			Part_Time();
			break;
		default:
			Absent();
		}
	}
}
