package com.simplilearn.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exeption1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Number");

		try {
			int number1 = input.nextInt();
			System.out.println("Enter second Number");
			int number2 = input.nextInt();
			System.out.println("program output :" + number1 / number2);
		} catch (ArithmeticException arithmeticException) {

			System.out.println("Cannot divide by zero");
			arithmeticException.printStackTrace();
		} catch (InputMismatchException inputMismatchException) {

			System.out.println("please enter only numbers");
			inputMismatchException.printStackTrace();
		} finally {

			System.out.println("inside finally block");
			input.close();

		}

		System.out.println("program closed");

	}

}
