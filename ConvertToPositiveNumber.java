//Write a program to accept a number, if it is negative then covert it to a positive number.
//Expected output:
//
//Enter a number:
//-10
//The result is: 10


package com.trp.cj.basics;

import java.util.Scanner;

public class ConvertToPositiveNumber {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int number = sc.nextInt();
	int result;
	if(number >= 0) {
		result = number;
	}else {
		result = -number;
	}
	System.out.println("The result is: " + result);	
	sc.close();
	}
}
