package com.cg.matrix;

public class MatrixIdempotency {

	static void multiplyMatrix(int[][] mat, int res[][]) {
		int n = mat.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				res[i][j] = 0;
				for (int k = 0; k < n; k++)
					res[i][j] += mat[i][k] * mat[k][j];
			}
		}

	}

	static boolean checkForIdempotent(int mat[][]) {
		int n = mat.length;
		int[][] res = new int[n][n];
		multiplyMatrix(mat, res);

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if (res[i][j] != mat[i][j])
					return false;
		return true;
	}

	public static void main(String[] args) {
		int mat[][] = { { 2, -2, -4 }, { -1, 3, 4 }, { 1, -2, -3 } };

		if (checkForIdempotent(mat))
			System.out.println("Matrix is idempotent!");
		else
			System.out.println("Matrix isn't idempotent!");
	}
}
