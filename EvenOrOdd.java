//Write a program to accept a number from the user and determine whether it is even or odd.
//
//Expected output:
//
//Enter a number:
//15
//The entered number 15 is odd
//
//Enter a number
//10
//The entered number 10 is even

package com.trp.cj.basics;

import java.util.Scanner;

public class EvenOrOdd {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	int number = sc.nextInt();
	if(number%2 == 0) {
		System.out.println("The entered number " + number + " is even");
	}else {
		System.out.println("The entered number " + number + " is odd");
	}
	sc.close();
}
}
