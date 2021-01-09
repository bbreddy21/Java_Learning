package com.simplilearn.innerclasses;

public class InnerClass4 {

	static class Inner {
		public void display() {
			System.out.println("I am inside static inner class and method");

		}
	}

	public static void main(String[] args) {

		Inner inner = new Inner();
		inner.display();

	}

}
