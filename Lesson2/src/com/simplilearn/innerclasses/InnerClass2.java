package com.simplilearn.innerclasses;

public class InnerClass2 {

	private String message = "welcome to java";

	public void display() {

		class Inner {

			String hello = "Hello Learners";

			void greet() {

				System.out.println(hello + "," + message);
			}

		}

		Inner inner = new Inner();
		inner.greet();

	}

	public static void main(String[] args) {

		InnerClass2 innerclass2 = new InnerClass2();
		innerclass2.display();

	}

}
