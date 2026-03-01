package com.cg.matrix;

import java.util.Arrays;
import java.util.List;

public class ToePlitzMatrix {

	static boolean checkDiagonal(List<List<Integer>> mat, int x, int y) {
		int n = mat.size(), m = mat.get(0).size();

		for (int i = x + 1, j = y + 1; i < n && j < m; i++, j++)
			if (!mat.get(i).get(j).equals(mat.get(x).get(y)))
				return false;
		return true;
	}

	static boolean isToePlitz(List<List<Integer>> mat) {
		int n = mat.size(), m = mat.get(0).size();

		for (int i = 0; i < m; i++)
			if (!checkDiagonal(mat, 0, i))
				return false;

		for (int i = 0; i < n; i++)
			if (!checkDiagonal(mat, i, 0))
				return false;

		return true;
	}

	public static void main(String[] args) {
		List<List<Integer>> mat = Arrays.asList(Arrays.asList(6, 7, 8), Arrays.asList(4, 6, 7), Arrays.asList(1, 4, 6));

		if (isToePlitz(mat))
			System.out.print("True");
		else
			System.out.print("False");
	}
}
