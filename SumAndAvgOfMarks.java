//Write a program to accept the marks scored in three subjects; determine the sum and average of the entered marks. Grade is awarded based on following criteria.
//
//If average is < 35 -- “C”; >35 and <60 -- “B”; Otherwise -- “A”
//
//Expected output:
//
//Enter the marks scored in 1st subject:
//40
//Enter the marks scored in 2nd subject:
//60
//Enter the marks scored in 3rd subject:
//80
//
//Total marks: 180
//Average is: 60.0
//Grade: “B”

package com.trp.cj.basics;

import java.util.Scanner;

public class SumAndAvgOfMarks {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the marks scored in 1st subject:");
	int subject1 = sc.nextInt();
	System.out.println("Enter the marks scored in 2nd subject:");
	int subject2 = sc.nextInt();
	System.out.println("Enter the marks scored in 3rd subject:");
	int subject3 = sc.nextInt();
	int total = subject1 + subject2 + subject3;
	int average = total/3;
	System.out.println("Total marks: " + total);
	System.out.println("Average is: " + average);
	if(average < 35) {
		System.out.println("Grade: C ");
	}else if(35 < average < 60){
		System.out.println("Grade: B ");
	}else {
		System.out.println("Grade: A ");
	}
}
}
