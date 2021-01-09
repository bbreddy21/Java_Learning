package com.simplilearn.exceptions;

public class VotingSystem {

	public static void main(String[] args) {
		int age = 17;
		try {
			validateAge(age);

		} catch (InvalidAgeException ageException) {

			ageException.printStackTrace();
		}
		System.out.println("program terminates");

	}

	private static void validateAge(int age) throws InvalidAgeException {
		if (age <= 18) {
			throw new InvalidAgeException("You are not elgible");
		} else {

			System.out.println("You can vote");
		}
	}

}
