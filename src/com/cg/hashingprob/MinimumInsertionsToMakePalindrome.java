package com.cg.hashingprob;

import java.util.Scanner;

public class MinimumInsertionsToMakePalindrome {

	public static void main(String[] args) {

		int res = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the text!");

		String str = sc.nextLine();

		int n = str.length();

		int count[] = new int[26];
		for (int i = 0; i < n; i++)
			count[str.charAt(i) - 'a']++;

		for (int i = 0; i < 26; i++)
			if (count[i] % 2 == 1)
				res++;

		System.out.println(res == 0 ? 0 : res - 1);
		sc.close();
	}

}
