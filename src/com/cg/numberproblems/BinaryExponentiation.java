package com.cg.numberproblems;

import java.util.Scanner;

public class BinaryExponentiation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a,b and p");

		int x = sc.nextInt();
		int y = sc.nextInt();
		int p = sc.nextInt();

		int res = 1;
		if (x >= p)
			x = x % p;

		if (x == 0) {
			System.out.println("Power is " + x);
			return;
		}

		while (y > 0) {
			if ((y & 1) != 0)
				res = (res * x) % p;

			y = y >> 1;
			x = (x * x) % p;
		}
		System.out.println("Power is " + res);
	}
}
