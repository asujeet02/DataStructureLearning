package com.cg.numberproblems;

import java.util.Scanner;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number!");
		int num = sc.nextInt();

		int maxPrime = -1;

		while (num % 2 == 0) {
			maxPrime = 2;
			num /= 2;
		}

		while (num % 3 == 0) {
			maxPrime = 3;
			num /= 3;
		}

		for (int i = 5; i * i <= num; i += 6) {
			while (num % i == 0) {
				maxPrime = i;
				num /= i;
			}

			while (num % (i + 2) == 0) {
				maxPrime = i + 2;
				num /= (i + 2);
			}
		}

		if (num > 4)
			maxPrime = num;

		System.out.println("The largest prime factor is " + maxPrime);
	}
}
