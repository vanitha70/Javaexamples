//Write a program to accept the billing amount, if it is > 6000 then give a discount of 10% and display the net amount.
//
//Expected output:
//
//Enter the billing amount:
//6500
//Your net billing amount: 5850
//
//Enter the billing amount:
//5500
//Your net billing amount: 5500

package com.trp.cj.basics;

import java.util.Scanner;

public class DiscountBilling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the billing amount: ");
		int billingamount = sc.nextInt();
		int netbilling;
		if(billingamount >= 6000) {
			netbilling = (billingamount * 90)/100;
		}else {
			netbilling = billingamount;
		}
		System.out.println("Your net billing amount: " + netbilling);
		sc.close();
	}

}
