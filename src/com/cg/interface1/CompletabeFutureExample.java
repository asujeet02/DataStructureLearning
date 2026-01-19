package com.cg.interface1;

import java.util.concurrent.CompletableFuture;

public class CompletabeFutureExample {

	public static void main(String[] args) {
		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			return "Hello";
		});

		CompletableFuture<String> transformedFuture = future.thenApply(result -> {
			return result + " world!";
		});

		transformedFuture.thenAccept(finalResult -> {
			System.out.println("Final Result:" + finalResult);
		});

		System.out.println("Main thread continues....");

		transformedFuture.join();
	}
}
