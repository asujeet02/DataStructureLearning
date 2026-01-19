package com.cg.objects;

public class NonStaticClasses {

	static int staticOuterX=20;
	
	static class StaticInnerClass{
		static void display()
		{
			System.out.println("Static outer class variable: "+staticOuterX);
		}
	}
	
	public static void main(String[] args) {
		StaticInnerClass.display();
	}
}
