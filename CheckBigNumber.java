//Write a program to accept two numbers from the user and determine bigger of the two.
//
//Expected output:
//
//Enter the first number num1:
//20
//Enter the second number num2:
//45
//
//The bigger of the two numbers entered (20 and 45) is: 45

package com.trp.cj.basics;

import java.util.Scanner;

public class CheckBigNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number num1: ");
		int firstnumber = sc.nextInt();
		System.out.println("Enter the Second number num2: ");
		int secondnumber = sc.nextInt();
		if(firstnumber > secondnumber) {
		System.out.println("The bigger of the two numbers entered (" + firstnumber + " and " + secondnumber + ") is: " + firstnumber);
		}else {
			System.out.println("The bigger of the two numbers entered (" + firstnumber + " and " + secondnumber + ") is: " + secondnumber);
		}
		sc.close();
	}

}
