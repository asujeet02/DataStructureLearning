package com.cg.logicbuilding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OverlapRectangle {

	static class Point {
		int x, y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Point> pointsArray = new ArrayList<>();
		System.out.println("Enter the coordinates of rectangle");
		while (pointsArray.size() != 4) {
			pointsArray.add(new Point(sc.nextInt(), sc.nextInt()));
		}

		Point l1 = pointsArray.get(0);
		Point r1 = pointsArray.get(1);
		Point l2 = pointsArray.get(2);
		Point r2 = pointsArray.get(3);

		if (l1.x > r2.x || l2.x > r1.x) {
			System.out.println("Do not overlap");
			return;
		}

		if (r1.y > l2.y || r2.y > l1.y) {
			System.out.println("Do not overlap");
			return;
		}
		System.out.println("Over Lapped");
	}

}
