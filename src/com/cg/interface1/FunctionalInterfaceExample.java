package com.cg.interface1;

@FunctionalInterface
interface GreetingService {
	void greeting(String name);
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		GreetingService greetingService = name -> System.out.println("Hello " + name + "!");

		greetingService.greeting("World");
	}
}
