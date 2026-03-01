package com.cg.matrix;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleDPOptimized {

	static List<List<Integer>> printPascal(int n) {
		List<List<Integer>> mat = new ArrayList<List<Integer>>();

		for (int row = 0; row < n; row++) {
			List<Integer> arr = new ArrayList<Integer>();

			for (int i = 0; i <= row; i++) {
				if (row == i || i == 0)
					arr.add(1);
				else
					arr.add(mat.get(row - 1).get(i - 1) + mat.get(row - 1).get(i));
			}
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
