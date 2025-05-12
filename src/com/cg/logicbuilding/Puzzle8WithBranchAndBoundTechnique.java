package com.cg.logicbuilding;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Puzzle8WithBranchAndBoundTechnique {
	static class Node {
		Node parent;
		int mat[][];
		int x, y;
		int cost;
		int level;

		Node(int[][] mat, int x, int y, int level, Node parent) {
			this.mat = new int[3][3];
			this.x = x;
			this.y = y;
			this.level = level;
			this.parent = parent;
			this.cost = Integer.MAX_VALUE;
		}
	}

	static void printMatrix(int[][] mat) {
		for (int row[] : mat) {
			for (int val : row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}

	// Bottom, left, top, right movement
	static int[] row = { 1, 0, -1, 0 };
	static int[] col = { 0, -1, 0, 1 };

	static int calculateCost(int[][] initial, int[][] goal) {
		int count = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (initial[i][j] != 0 && initial[i][j] != goal[i][j]) {
					count++;
				}
			}
		}
		return count;
	}

	static boolean isSafe(int x, int y) {
		return (x >= 0 && x < 3 && y >= 0 && y < 3);
	}

	static void printPath(Node root) {
		if (root == null)
			return;
		printPath(root.parent);
		printMatrix(root.mat);
		System.out.println();
	}

	static class Comp implements Comparator<Node> {
		public int compare(Node lhs, Node rhs) {
			return (lhs.cost + lhs.level) - (rhs.cost + rhs.level);
		}
	}

	static void solve(int[][] initial, int x, int y, int[][] goal) {
		PriorityQueue<Node> pq = new PriorityQueue<>(new Comp());
		Node root = new Node(initial, x, y, 0, null);
		root.cost = calculateCost(initial, goal);
		pq.add(root);

		while (!pq.isEmpty()) {
			Node min = pq.poll();

			if (min.cost == 0) {
				printPath(min);
				return;
			}

			for (int i = 0; i < 4; i++) {
				int newX = min.x + row[i], newY = min.y + col[i];

				if (isSafe(newX, newY)) {
					int[][] newMat = new int[3][3];
					for (int j = 0; j < 3; j++) {
						System.arraycopy(min.mat[j], 0, newMat[j], 0, 3);
					}
					newMat[min.x][min.y] = newMat[newX][newY];
					newMat[newX][newY] = 0;

					Node child = new Node(newMat, newX, newY, min.level + 1, min);
					child.cost = calculateCost(child.mat, goal);
					pq.add(child);
				}
			}
		}

	}

	public static void main(String[] args) {
		int[][] initial = { { 1, 0, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };
		int[][] goal = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };

		int x = 0, y = 1;
		solve(initial, x, y, goal);
	}
}
