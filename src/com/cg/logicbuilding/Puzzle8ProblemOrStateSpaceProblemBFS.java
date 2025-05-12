package com.cg.logicbuilding;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

class PuzzleState implements Comparable<PuzzleState> {
	long board;
	int x, y;
	int depth;
	int f;

	PuzzleState(long b, int i, int j, int d, int h) {
		this.board = b;
		this.x = i;
		this.y = j;
		this.depth = d;
		this.f = d + h;
	}

	@Override
	public int compareTo(PuzzleState other) {
		return Integer.compare(this.f, other.f);
	}
}

public class Puzzle8ProblemOrStateSpaceProblemBFS {
	static final int N = 3;
	static int row[] = { 0, 0, -1, 1 };
	static int col[] = { -1, 1, 0, 0 };
	static final long GOAL_STATE = 123456780L;

	static long boardToLong(int[][] board) {
		long result = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				result = result * 10 + board[i][j];
			}
		}
		return result;
	}

	static String boardToString(long board) {
		String s = String.valueOf(board);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 9 - s.length(); i++) {
			sb.append('0');
		}
		sb.append(s);
		return sb.toString();
	}

	static boolean isGoalState(long board) {
		return board == GOAL_STATE;
	}

	static void printBoard(long board) {
		String s = boardToString(board);
		for (int i = 0; i < 9; i++) {
			System.out.print(s.charAt(i) + " ");
			if ((i + 1) % 3 == 0) {
				System.out.println();
			}
		}
		System.out.println("-------");
	}

	static int calculateHeuristic(long board) {
		String s = boardToString(board);
		int h = 0;
		for (int i = 0; i < 9; i++) {
			int num = s.charAt(i) - '0';
			if (num != 0) {
				int goalX = (num - 1) % 3;
				int goalY = (num - 1) / 3;
				int currentX = i % 3;
				int currentY = i / 3;
				h += Math.abs(goalX - currentX) + Math.abs(goalY - currentY);
			}
		}
		return h;
	}

	static void solvePuzzleStar(int[][] start, int x, int y) {
		PriorityQueue<PuzzleState> queue = new PriorityQueue<>();
		Set<Long> visited = new HashSet<>();
		long startBoard = boardToLong(start);
		int h = calculateHeuristic(startBoard);
		queue.add(new PuzzleState(startBoard, x, y, 0, h));
		visited.add(startBoard);

		while (!queue.isEmpty()) {
			PuzzleState curr = queue.poll();
			System.out.println("Depth " + curr.depth);
			printBoard(curr.board);

			if (isGoalState(curr.board)) {
				System.out.println("Goal state reached at depth " + curr.depth);
				return;
			}

			String s = boardToString(curr.board);
			char[] boardArray = s.toCharArray();

			for (int i = 0; i < 4; i++) {
				int newX = curr.x + row[i];
				int newY = curr.y + col[i];

				if (newX >= 0 && newX < N && newY >= 0 && newY < N) {
					int zeroPos = curr.x * N + curr.y;
					int swapPos = newX * N + newY;

					char temp = boardArray[zeroPos];
					boardArray[zeroPos] = boardArray[swapPos];
					boardArray[swapPos] = temp;

					long newBoardLong = Long.parseLong(new String(boardArray));

					if (!visited.contains(newBoardLong)) {
						int newH = calculateHeuristic(newBoardLong);
						visited.add(newBoardLong);
						queue.add(new PuzzleState(newBoardLong, newX, newY, curr.depth + 1, newH));
					}

					boardArray[swapPos] = boardArray[zeroPos];
					boardArray[zeroPos] = temp;
				}
			}
		}
		System.err.println("No solution found");
	}

	public static void main(String[] args) {
		int[][] start = { { 1, 2, 3 }, { 4, 0, 5 }, { 6, 7, 8 } };
		int x = 1, y = 1;

		System.out.println("Initial state: ");
		printBoard(boardToLong(start));

		solvePuzzleStar(start, x, y);
	}
}
