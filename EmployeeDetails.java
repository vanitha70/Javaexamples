//Write a program to accept the following details of an employee: empno, name and monthly salary; calculate the yearly salary and display the result.
//
//Expected output:
//
//Enter the empno:
//1001
//Enter the employee name:
//Ramana
//Enter the monthly salary:
//25000
//Hi Ramana! Your employee id is 1001, monthly salary is Rs 25,000 and yearly salary is Rs 300,000.

package com.trp.cj.basics;

import java.util.Scanner;

public class EmployeeDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the empno: ");
		int empno = sc.nextInt();
		System.out.println("Enter the monthly salary: ");
		int salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the employee name: ");
		String employee = sc.nextLine();
		System.out.println("Hi " + employee + "! Your employee id is " + empno + ", monthly salary is Rs " + salary
				+ " and yearly salary is Rs " + 12 * salary);
		sc.close();
	}
}
