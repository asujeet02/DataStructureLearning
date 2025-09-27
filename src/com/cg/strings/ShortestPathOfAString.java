package com.cg.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ShortestPathOfAString {

	static ArrayList<String> printPath(String str) {

		ArrayList<String> result = new ArrayList<String>();

		HashMap<Character, int[]> pos = new HashMap<Character, int[]>();

		char ch = 'A';

		for (int i = 0; i < 5; i++)
			for (int j = 0; j < 5 && ch <= 'Y'; j++, ch++)
				pos.put(ch, new int[] { i, j });

		pos.put('Z', new int[] { 5, 0 });

		int x = 0, y = 0;

		for (char c : str.toCharArray()) {
			int targetX = pos.get(c)[0];
			int targetY = pos.get(c)[1];

			while (y < targetY) {
				result.add("RIGHT");
				y++;
			}

			while (y > targetY) {
				result.add("LEFT");
				y--;
			}

			while (x < targetX) {
				result.add("DOWN");
				x++;
			}

			while (x > targetX) {
				result.add("UP");
				x--;
			}

			result.add("OK");
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to print");
		String str = sc.nextLine();

		for (String step : printPath(str))
			System.out.print(step + " ");
		System.out.println();
	}
}
