package com.cg.arrays.rotatearray;

import java.util.Scanner;

public class RotateJugglingArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arrayToBeJuggled = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int n = arrayToBeJuggled.length;
		System.out.println("Positions to be rotated!");
		int d = sc.nextInt();

		if (d > n) {
			d %= n;
		}

		int numberOfCycles = gcd(n, d);

		for (int i = 0; i < numberOfCycles; i++) {
			int currIndex = i;
			int currEle = arrayToBeJuggled[currIndex];

			do {
				int nextIndex = (currIndex + d) % n;
				int nextEle = arrayToBeJuggled[nextIndex];
				arrayToBeJuggled[nextIndex] = currEle;
				currEle = nextEle;
				currIndex = nextIndex;
			} while (currIndex != i);
		}

		for (int x : arrayToBeJuggled) {
			System.out.print(x + " ");
		}
	}

	private static int gcd(int a, int b) {

		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
