/**
 * *Write a program to accept two numbers from the user, swap their values and display the result.
 *
 *Expected output:
 *Enter the first number num1:
* 100
*Enter the second number num2:
*200
*Before swap, the values of num1=100 and num2=200
*After swap, the values of num1=200 and num2=100
*/
package com.trp.cj.basics;

import java.util.Scanner;

public class SwappingNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number num1:");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number num2:");
		int num2 = sc.nextInt();
		System.out.println("Before swap, the values of num1 = " + num1 + " and num2 = " + num2);
//		int temp = num1;
//		num1 = num2;
//		num2 = temp;
		num1 =num1 * num2;
		num2 = num1 / num2;
		num1 = num1 /num2;
		System.out.println("After swap, the values of num1 = " + num1 + " and num2 = " + num2);
		sc.close();
	}

}
