package com.cg.numberproblems;

import java.util.Scanner;

public class NumberWithThreeDivisors {

	private static boolean isPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number!");
		int n = sc.nextInt();

		for (int i = 2; i * i <= n; i++) {
			if (isPrime(i)) {
				System.out.print(i * i + " ");
			}
		}
	}
}
