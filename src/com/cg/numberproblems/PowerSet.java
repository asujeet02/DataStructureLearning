package com.cg.numberproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class PowerSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string value");
		String str = sc.nextLine();
		int n = str.length();
		ArrayList<String> res = new ArrayList<>();

		for (int i = 0; i < (1 << n); i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) != 0)
					sb.append(str.charAt(j));
			}
			res.add(sb.toString());
		}
		System.out.println(res.toString());
	}
}
