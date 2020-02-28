//Write a program to accept 3 numbers from the user and find the biggest of them.
//
//Expected output:
//
//Enter the 1st number num1:
//45
//Enter the 2nd number num2:
//75
//Enter the 3rd number num3:
//45
//The biggest of the 3 numbers entered is: 75

package com.trp.cj.basics;

import java.util.Scanner;

public class BiggestNumberInThree {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the 1st number num1:");
int num1 = sc.nextInt();
System.out.println("Enter the 2nd number num2:");
int num2 = sc.nextInt();
System.out.println("Enter the 3rd number num3:");
int num3 = sc.nextInt();
if(num1>num2) {
	if(num1 > num3) {
	System.out.println("The biggest of the 3 numbers entered is: " + num1);	
	}else {
	System.out.println("The biggest of the 3 numbers entered is: " + num3);
	}
}else {
	if(num2 > num3) {
		System.out.println("The biggest of the 3 numbers entered is: " + num2);	
	}else {
		System.out.println("The biggest of the 3 numbers entered is: " + num3);
	}
}
sc.close();
}
}
