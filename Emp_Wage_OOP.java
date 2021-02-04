package com.Emp_Wage;
import java.io.*;
class Emp_Daily_Wage {
	public static void Daily_Wage() {
		int Wage_Per_Hr = 20;
		int Full_Day_Hr = 8;
		int Wage = Wage_Per_Hr * Full_Day_Hr;
		System.out.println("Employee Daily Wage is :" + Wage);
	}
}
public class Emp_Wage_OOP extends Emp_Daily_Wage {

	public static void Emp_Check() {

		int empType = (int) (Math.random() * 10) % 2;

		if (empType == 1) {

			System.out.println("Employee is present");
			Daily_Wage();
		} else {
			System.out.println("Employee is absent");
		}

	}
         public static void main(String args[]) {
		Emp_Check();
	}
}

