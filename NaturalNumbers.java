//Write a program to generate the first 'N' natural numbers. Accept the value of 'N' from the user.
//
//Expected output:
//
//Enter the number of natural numbers to be generated:
//5
//First 5 natural numbers are : 1 2 3 4 5

package com.trp.cj.basics;

import java.util.Scanner;

public class NaturalNumbers {
public static void main(String[] args) {
 int i=0;
 int result;

 for(i=0; i =< n; i++) {
	 result = i + 1;
 }
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the number of natural numbers to be generated: ");
 int n = sc.nextInt();
 System.out.println("First 5 natural numbers are :" + result);
}
}
