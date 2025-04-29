package com.cg.numberproblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RecurringFraction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numerator");
		int num = sc.nextInt();
		System.out.println("Enter the denominator");
		int den = sc.nextInt();

		if (num == 0) {
			System.out.println("0");
			return;
		}

		String res = (num < 0) ^ (den < 0) ? "-" : "";
		num = Math.abs(num);
		den = Math.abs(den);

		res += Integer.toString(num / den);
		int rem = num % den;
		if (rem == 0) {
			System.out.println(res);
			return;
		}

		res += ".";
		Map<Integer, Integer> newMap = new HashMap<>();

		while (rem > 0) {
			if (newMap.containsKey(rem)) {
				res = res.substring(0, newMap.get(rem)) + "(" + res.substring(newMap.remove(rem)) + ")";
				break;
			}

			newMap.put(rem, res.length());
			rem = rem * 10;

			res += Integer.toString(rem / den);
			rem = rem % den;
		}
		System.out.println(res);
		return;
	}
}
