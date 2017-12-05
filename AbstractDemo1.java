package com.session.abstractclass.examples;

abstract class Demo {
	public void f1() {
		System.out.println("I AM From f1 Method");
	}

	public void f2() {
		System.out.println("I Am From f2 Method");
	}

	public abstract void f3();

	public abstract void f4();
}

abstract class Demo1 extends Demo {
	@Override
	public void f3() {
		System.out.println("I Am From f3 Method");
	}

	public void f5() {
		System.out.println("I Am From F5 Method");
	}
}

class Demo2 extends Demo1 {

	@Override
	public void f4() {
		System.out.println("I AM From f4 Method");
	}

	@Override
	public void f2() {
		System.out.println("I Am From f2 Method Re Defined");
	}

	public void f6() {
		System.out.println("I Am From f6 Method");
	}
}

public class AbstractDemo1 {
	public static void main(String[] args) {
		System.out.println("I AM FROM MAIN METHOD");
		System.out.println("Normal Inheritance Style");
		// Demo demo = new Demo(); // It is not possible to Instantiate An
		// Object Of Abstract Class Directly
		// Demo1 demo1 = new Demo1();
		Demo2 demo2 = new Demo2();
		demo2.f1();
		demo2.f2();
		demo2.f3();
		demo2.f4();
		demo2.f5();
		demo2.f6();
		System.out.println("Dynamic Binding Concept");
		System.out.println("With Demo Reference");
		Demo demo = null; // Demo is an Base Class Reference
		demo = new Demo2();
		demo.f1();
		demo.f2();
		demo.f3();
		demo.f4();
		// demo.f5();
		// demo.f6();

		System.out.println("With Demo1 Reference");
		Demo1 demo1 = null;
		demo1 = new Demo2();
		demo1.f1();
		demo1.f2();
		demo1.f3();
		demo1.f4();
		demo1.f5();
		// demo1.f6();
	}
}
