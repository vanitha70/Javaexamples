package com.trp.cj.basics;

import java.util.Scanner;

public class AvgWeights {
	public static void main(String[] args) {

		Scanner myobj = new Scanner(System.in);
		int weight1 = myobj.nextInt();
		int weight2 = myobj.nextInt();
		int weight3 = myobj.nextInt();
		int sum = weight1 + weight2 + weight3;
		float avg = (weight1 + weight2 + weight3) / 3;
		System.out.println("sum of weights: " + sum);
		System.out.println("avg. of weights: " + avg);

		myobj.close();
	}

}
