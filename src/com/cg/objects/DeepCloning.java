package com.cg.objects;

class Test {
	int x, y;
}

class Test2 implements Cloneable {

	int a, b;
	Test c = new Test();

	public Object clone() throws CloneNotSupportedException {
		Test2 t = (Test2) super.clone();

		t.c = new Test();
		t.c.x = c.x;
		t.c.y = c.y;
		return t;
	}
}

public class DeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		Test2 t1 = new Test2();
		t1.a = 10;
		t1.b = 20;
		t1.c.x = 30;
		t1.c.y = 40;

		Test2 t3 = (Test2) t1.clone();
		t3.a = 100;
		t3.c.x = 300;

		System.out.println(t1.a + " " + t1.b + " " + t1.c.x + " " + t1.c.y);
		System.out.println(t3.a + " " + t3.b + " " + t3.c.x + " " + t3.c.y);
	}
}
