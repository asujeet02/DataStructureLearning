package com.cg.logicbuilding;

import java.util.Scanner;

public class CountSetBits {
	public static void main(String[] args) {
		System.out.println("Enter a number!");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		while (n != 0) {
			count += n & 1;
			n >>= 1;
		}

		System.out.println("The set bits are:" + count);
	}
}
