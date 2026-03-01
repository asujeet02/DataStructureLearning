package com.cg.matrix;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	static int binomialCofficient(int n, int k) {
		int res = 1;
		if (k > n - k)
			k = n - k;
		for (int i = 0; i < k; i++) {
			res *= (n - i);
			res /= (i + 1);
		}
		return res;
	}

	static List<List<Integer>> printPascal(int n) {
		List<List<Integer>> mat = new ArrayList<List<Integer>>();
		for (int row = 0; row < n; row++) {
			List<Integer> arr = new ArrayList<Integer>();
			for (int i = 0; i <= row; i++)
				arr.add(binomialCofficient(row, i));
			mat.add(arr);
		}

		return mat;
	}

	public static void main(String[] args) {
		int n = 5;
		List<List<Integer>> mat = printPascal(n);
		for (int i = 0; i < mat.size(); i++) {
			for (int j = 0; j < mat.get(i).size(); j++)
				System.out.print(mat.get(i).get(j) + " ");
			System.out.println();
		}
	}
}
