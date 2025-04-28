package com.cg.logicbuilding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddFraction {

	static int gcd(int n1, int n2) {
		if (n1 == 0)
			return n2;
		return gcd(n2 % n1, n2);
	}

	public static void main(String[] args) {
		List<Integer> ans = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while (i < 4) {
			ans.add(sc.nextInt());
			i++;
		}

		int den = gcd(ans.get(1), ans.get(3));

		den = (ans.get(1) * ans.get(3)) / den;

		int num = (ans.get(0)) * (den / ans.get(1)) + (ans.get(2)) * (den / ans.get(3));

		int commonFactor = gcd(num, den);
		if (den % commonFactor == 0 && num % commonFactor == 0) {
			den = den / commonFactor;
			num = num / commonFactor;
		}

		ans.clear();
		ans.add(num);
		ans.add(den);

		System.out.println("The given fraction sum is: " + ans.toString());
	}

}
