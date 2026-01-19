package com.cg.objects;

public class JoiningThreads {

	public static void main(String[] args) {
		JoinedThreads t1 = new JoinedThreads();
		JoinedThreads t2 = new JoinedThreads();
		JoinedThreads t3 = new JoinedThreads();

		t1.start();

		try {
			System.out.println("Current Thread: " + Thread.currentThread().getName());
			t1.join();
		} catch (Exception e) {
			System.out.println("Exception has been caught " + e.getMessage());
		}

		t2.start();

		try {
			System.out.println("Current Thread: " + Thread.currentThread().getName());
			t2.join();
		} catch (Exception e) {
			System.out.println("Exception has been caught " + e.getMessage());
		}

		t3.start();

		try {
			System.out.println("Current Thread: " + Thread.currentThread().getName());
			t3.join();
		} catch (Exception e) {
			System.out.println("Exception has been caught " + e.getMessage());
		}
	}
}

class JoinedThreads extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			try {
				Thread.sleep(500);
				System.out.println("Current Thread: " + Thread.currentThread().getName());
			} catch (Exception ex) {
				System.out.println("Exception has been caught " + ex.getMessage());
			}
			System.out.println(i);
		}
	}
}