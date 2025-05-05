package com.cg.numberproblems;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	static int binoCofficient(int n, int k) {
		int res = 1;
		if (k > n - k)
			k = n - k;
		for (int i = 0; i < k; i++) {
			res *= (n - i);
			res /= (i + 1);
		}
		return res;
	}

	static List<List<Integer>> printThePascal(int n) {
		List<List<Integer>> mat = new ArrayList<>();
		for (int row = 0; row < n; row++) {
			List<Integer> arr = new ArrayList<>();
			for (int i = 0; i <= row; i++)
				arr.add(binoCofficient(row, i));
			mat.add(arr);
		}
		return mat;
	}

	public static void main(String[] args) {
		int n = 5;
		List<List<Integer>> mat = printThePascal(n);
		for (int i = 0; i < mat.size(); i++) {
			for (int j = 0; j < mat.get(i).size(); j++) {
				System.out.print(mat.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
}
