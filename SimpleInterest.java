//  Write a program to accept the principal amount, rate of interest, time and calculate the simple interest.
//
//Expected output:
//
//Enter the principal amount:
//20000
//Enter the rate of interest
//1.5
//Enter the time (years)
//2
//
//Simple interest is 600
//
//(Help: Simple Interest formula ((p*t*r)/100))

package com.trp.cj.basics;

import java.util.Scanner;

public class SimpleInterest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the principal amount: ");
	int principalamount = sc.nextInt();
	System.out.println("Enter the rate of interest: ");
	int interest = sc.nextInt();
	System.out.println("Enter the time (years): ");
	int time = sc.nextInt();
	int simpleinterest = (principalamount * time * interest)/100;
	System.out.println("Simple interest is: " + simpleinterest );
	sc.close();
}
}
