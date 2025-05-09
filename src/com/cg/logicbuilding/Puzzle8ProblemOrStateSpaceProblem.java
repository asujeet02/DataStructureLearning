package com.cg.logicbuilding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Puzzle8ProblemOrStateSpaceProblem {
	static final int N = 3;
	static int[] row = { 0, 0, -1, 1 };
	static int[] col = { -1, 1, 0, 0 };

	static class PuzzleState {
		int[][] board;
		int x, y;
		int depth;
		int hash;

		PuzzleState(int[][] b, int i, int j, int d) {
			board = new int[N][N];
			for (int k = 0; k < N; k++)
				board[k] = Arrays.copyOf(b[k], N);
			x = i;
			y = j;
			depth = d;
			hash = Arrays.deepHashCode(board);
		}

		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (o == null || getClass() != o.getClass())
				return false;
			PuzzleState that = (PuzzleState) o;
			return hash == that.hash;
		}

		@Override
		public int hashCode() {
			return hash;
		}
	}

	static boolean isGoalState(int[][] board) {
		int[][] goal = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 0 } };
		return Arrays.deepEquals(board, goal);
	}

	static boolean isValid(int x, int y) {
		return (x >= 0 && x < N && y >= 0 && y < N);
	}

	static void printBoard(int[][] board) {
		for (int[] row : board) {
			for (int num : row)
				System.out.print(num + " ");
			System.out.println();
		}
		System.out.println("-----------");
	}

	static void solvePuzzleBFS(int[][] start, int x, int y) {
		Queue<PuzzleState> queue = new LinkedList<>();
		Set<PuzzleState> visited = new HashSet<>();

		queue.add(new PuzzleState(start, x, y, 0));
		visited.add(new PuzzleState(start, x, x, 0));

		while (!queue.isEmpty()) {
			PuzzleState curr = queue.poll();
			System.out.println("Depth: " + curr.depth);
			printBoard(curr.board);

			if (isGoalState(curr.board)) {
				System.out.println("Goal state reached at depth " + curr.depth);
				return;
			}

			for (int i = 0; i < 4; i++) {
				int newX = curr.x + row[i];
				int newY = curr.y + col[i];

				if (isValid(newX, newY)) {
					int[][] newBoard = new int[N][N];
					for (int j = 0; j < N; j++) {
						newBoard[j] = Arrays.copyOf(curr.board[j], N);
					}

					int temp = newBoard[curr.x][curr.y];
					newBoard[curr.x][curr.y] = newBoard[newX][newY];
					newBoard[newX][newY] = temp;

					PuzzleState newState = new PuzzleState(newBoard, newX, newY, curr.depth + 1);

					if (!visited.contains(newState)) {
						visited.add(newState);
						queue.add(newState);
					}
				}
			}

		}
		System.out.println("No solution found (Unsolvable Puzzle)");
	}

	public static void main(String[] args) {
		int[][] start = { { 1, 2, 3 }, { 4, 0, 5 }, { 6, 7, 8 } };
		int x = 1, y = 1;
		System.out.println("Initial state: ");
		printBoard(start);

		solvePuzzleBFS(start, x, y);
	}
}
