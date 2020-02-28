//In a shopping mall, privileged customers (if they have a membership card) are being given a 10% discount on the billed amount, and the others are being given a 3% discount. Write a program to accept the billing amount and confirm the membership card from the customer; calculate and display the net amount to be paid by the customer.
//
//Expected output:
//
//Enter the bill amount:
//5000
//Do you have a membership card?
//Y
//Thank you! Your total bill amount is Rs 5000, discount is Rs 500 and net amount payable is Rs 4500.
//
//
//Enter the bill amount:
//5000
//Do you have a membership card?
//N
//Thank you! Your total bill amount is Rs 5000, discount is Rs 150 and net amount payable is Rs 4850.

package com.trp.cj.basics;

import java.util.Scanner;

public class MemberedShoppingCustumer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill amount: ");
		int billamount = sc.nextInt();
		System.out.println("Do you have a membership card (Y/N):  ");
		String membership, N, Y;
		int netbill;
		int discount;
		if(membership == Y) {
			netbill = (billamount * 90)/100;
			discount = (billamount* 10)/100;
			System.out.println("Thank you! Your total bill amount is Rs " + billamount + ", discount is Rs " + discount + " and net amount payable is Rs " + netbill);
		}else if(membership == N) {
			netbill = (billamount * 97)/100;
			discount = (billamount * 3)/100;
			System.out.println("Thank you! Your total bill amount is Rs " + billamount + ", discount is Rs " + discount + " and net amount payable is Rs " + netbill);
		}
		sc.close();

	}

}
