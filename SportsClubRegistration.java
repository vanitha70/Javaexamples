//The Sports Club registration form has the following details: name, mobile number and age. Per the membership policy, the person should be at least 18 years old to become a member. Write a program to accept the details mentioned above; if the age is >18 years then display the entered details with a congratulatory message, else the following message should be displayed “Sorry! You need to be at least 18 years old to get membership.”
//
//Expected output:
//
//Enter the name:
//Lakshman
//Enter the mobile number:
//989999999
//Enter the age:
//16
//
//“Sorry! You need to be at least 18 years old to get membership.”
//
//Enter the name:
//Lakshman
//Enter the mobile number:
//989999999
//Enter the age:
//30
//
//“Congratulations Lakshman for your successful registration.”
//
//Hint: Use return statement in if block after displaying the “Sorry…” message.


package com.trp.cj.basics;

import java.util.Scanner;

public class SportsClubRegistration {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String candname = sc.nextLine();
		System.out.println("Enter the mobile number: ");
		String mobilenumber = sc.nextLine();
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		if(age >= 18) {
			System.out.println("Congratulations " + candname +" for your successful registration.");
		}else {
			System.out.println("Sorry! You need to be at least 18 years old to get membership.");
		}
		sc.close();
	}

}
