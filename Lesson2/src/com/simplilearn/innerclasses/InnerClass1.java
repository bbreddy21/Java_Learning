package com.simplilearn.innerclasses;

public class InnerClass1 {

	private String message = "welcome to java";

	class Inner {

		String hello = "Hello Learners";

		void greet() {

			System.out.println(hello +  "," +message);
		}

	}

	public static void main(String[] args) {
		
		InnerClass1 outer = new InnerClass1();
		InnerClass1.Inner inner = outer.new Inner();
		inner.greet();

	}

}
