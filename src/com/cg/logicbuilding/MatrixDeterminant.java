package com.cg.logicbuilding;

public class MatrixDeterminant {

	public static int getDeterminant(int[][] mat, int n) {
		if (n == 1)
			return mat[0][0];

		if (n == 2)
			return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];

		int res = 0;
		for (int col = 0; col < n; ++col) {
			int sub[][] = new int[n - 1][n - 1];
			for (int i = 1; i < n; ++i) {
				int subcol = 0;
				for (int j = 0; j < n; ++j) {
					if (j == col)
						continue;
					sub[i - 1][subcol++] = mat[i][j];
				}
			}

			int sign = (col % 2 == 0) ? 1 : -1;
			res += sign * mat[0][col] * getDeterminant(sub, n - 1);
		}
		return res;
	}

	public static void main(String[] args) {
		int mat[][] = { { 1, 0, 2, -1 }, { 3, 0, 0, 5 }, { 2, 1, 4, -3 }, { 1, 0, 5, 0 } };
		System.out.println(getDeterminant(mat, mat.length));
	}

}
