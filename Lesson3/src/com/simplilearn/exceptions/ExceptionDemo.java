package com.simplilearn.exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		int[] ints = new int[5];
		try {
			ints[7] = 10;

		} catch (ArrayIndexOutOfBoundsException ArrayIndexOutOfBoundsException) {
			System.out.println("exception occured ");

			ArrayIndexOutOfBoundsException.printStackTrace();
			/*
			 * ArrayIndexOutOfBoundsException.toString();
			 * ArrayIndexOutOfBoundsException.getMessage();
			 */
		} catch(Exception e) {
			
			e.printStackTrace();
		}

		System.out.println("Program terminates");

	}

}
