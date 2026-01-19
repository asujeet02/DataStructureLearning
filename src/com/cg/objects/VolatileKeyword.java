package com.cg.objects;

import java.util.Scanner;

public class VolatileKeyword {

	public static void main(String[] args) {
		VolatileExample volatileExample = new VolatileExample();
		volatileExample.start();

		Scanner input = new Scanner(System.in);
		input.nextLine();
		volatileExample.shutDown();
	}
}

class VolatileExample extends Thread {
	volatile boolean running = true;

	@Override
	public void run() {
		while (running)
			System.out.println("Run Volatile");
	}

	public void shutDown() {
		running = false;
	}
}
