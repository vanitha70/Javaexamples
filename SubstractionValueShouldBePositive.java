//Write a program to accept two numbers num1 and num2; when one is subtracted from the other, the result should always be a positive number.
//
//Expected output:
//
//Enter the first number num1:
//35
//Enter the second number num2:
//45
//The result (difference) is: 10
//
//Enter the first number num1:
//45
//Enter the second number num2:
//35
//The result (difference) is: 15

package com.trp.cj.basics;

import java.util.Scanner;

public class SubstractionValueShouldBePositive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number num2: ");
		int num2 = sc.nextInt();
		int result = num1 - num2;
		if(result >= 0) {
			System.out.println("The result (difference) is: " + result);
		}else {
			System.out.println("The result (difference) is: " + (-result));
		}
		sc.close();

	}

}
