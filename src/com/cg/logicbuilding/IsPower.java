package com.cg.logicbuilding;

import java.util.Scanner;

public class IsPower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x == y && y == 1) {
			System.out.println("x is a power of y");
			return;
		}

		long pow = x;
		while (pow < y) {
			pow += pow;
		}

		if (pow == y) {
			System.out.println("x is a power of y");
			return;
		}

		long low = x;
		long high = pow;

		while (low <= high) {
			long mid = low + (high - low) / 2;
			long result = (long) Math.pow(x, Math.log(mid) / Math.log(x));
			if (result == y) {
				System.out.println("x is a power of y");
				return;
			}

			else if (result < y)
				low = mid + 1;
			else
				high = mid - 1;
		}

		System.out.println("x is not a power of y");
	}

}
