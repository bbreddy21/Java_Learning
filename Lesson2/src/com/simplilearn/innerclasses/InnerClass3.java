package com.simplilearn.innerclasses;

public class InnerClass3 {

	public static void main(String[] args) {

		AnonymousInnerclass AnonymousInnerclass = new AnonymousInnerclass() {

			@Override
			public void display() {
				System.out.println("I am inside display method of class");

			}

		};

		AnonymousInnerclass.display();

	}

}

abstract class AnonymousInnerclass {

	public abstract void display();
}
