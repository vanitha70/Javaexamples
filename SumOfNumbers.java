package com.trp.cj.basics;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number1:");

		int num1 = sc.nextInt();
		System.out.println("Enter the number2:");
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + sum);
		sc.close();
	}
}
