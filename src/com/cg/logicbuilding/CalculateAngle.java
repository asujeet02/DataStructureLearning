package com.cg.logicbuilding;

import java.util.Scanner;

public class CalculateAngle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hour and minute values");
		double h = sc.nextDouble();
		double m = sc.nextDouble();

		if (h < 0 || m < 0 || h > 12 || m > 60) {
			System.out.println("Invalid input");
			return;
		}

		if (h == 12)
			h = 0;
		if (m == 60) {
			m = 0;
			h += 1;
			if (h > 12)
				h -= 12;
		}
		int hour_angle = (int) (0.5 * (h * 60 + m));
		int min_angle = (int) (6 * m);

		int angle = Math.abs(hour_angle - min_angle);
		angle = Math.min(360 - angle, angle);

		System.out.println("Angle between hour and minute hand is " + angle);
	}

}
