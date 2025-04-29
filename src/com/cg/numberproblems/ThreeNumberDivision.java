package com.cg.numberproblems;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeNumberDivision {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number!");
		int n = sc.nextInt();
		boolean[] prime = new boolean[n + 1];
		Arrays.fill(prime, true);
		prime[0] = prime[1] = false;

		for (int i = 2; i * i <= n; i++) {
			if (prime[i] == true) {
				for (int j = i * 2; j <= n; j += i) {
					prime[j] = false;
				}
			}
		}

		System.out.println("The number with 3 divisors are:");
		for (int i = 0; i * i <= n; i++)
			if (prime[i])
				System.out.print(i * i + " ");
	}

}
