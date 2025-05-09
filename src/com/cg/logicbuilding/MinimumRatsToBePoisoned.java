package com.cg.logicbuilding;

import java.util.Scanner;

public class MinimumRatsToBePoisoned {

	public static double log2(int x) {
		return (Math.log(x) / Math.log(2));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of bottles");
		int n = sc.nextInt();

		int minRatsRequired = (int) Math.floor(log2(n) + 1);

		System.out.println("Minimum " + minRatsRequired + " are required");
	}
}
