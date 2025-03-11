package com.cg.objects;

class ObjectDemo implements Cloneable {
	int x, y;

	ObjectDemo() {
		this.x = 10;
		this.y = 20;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ObjectClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		ObjectDemo objDemo = new ObjectDemo();
		ObjectDemo objClone = (ObjectDemo) objDemo.clone();

		System.out.println("x: " + objDemo.x + " and y: " + objDemo.y);
		System.out.println("x: " + objClone.x + " and y: " + objClone.y);
	}
}
