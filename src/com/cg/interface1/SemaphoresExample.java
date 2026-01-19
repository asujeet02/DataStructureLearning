package com.cg.interface1;

import java.util.concurrent.Semaphore;

public class SemaphoresExample {

	private static final int MAX_AVAILABLE = 3;
	private final Semaphore semaphore = new Semaphore(MAX_AVAILABLE, true);

	public void useResource(String threadName) {
		try {
			System.out.println(threadName + " is trying to acquire a permit.");
			semaphore.acquire();
			System.out.println(threadName + " acquired a permit. Using the resource.");
			Thread.sleep(2000);
			System.out.println(threadName + " finished using the resource.");
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		} finally {
			semaphore.release();
			System.out.println(threadName + " released a permit.");
		}
	}

	public static void main(String[] args) {
		SemaphoresExample semaphoresExample = new SemaphoresExample();

		for (int i = 0; i < 5; i++) {
			final int threadId = i;

			new Thread(() -> semaphoresExample.useResource("Thread - " + threadId)).start();
		}
	}

}
