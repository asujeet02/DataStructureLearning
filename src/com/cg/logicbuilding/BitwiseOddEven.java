package com.cg.logicbuilding;

import java.util.Scanner;

public class BitwiseOddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();

		if ((n & 1) == 0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");
	}

}
