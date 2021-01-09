package com.simplilearn.arrays;

import java.util.Scanner;

public class SearchArrayDemo {

	public static void main(String[] args) {
		String countries[] = { "india", "Japan" };
		System.out.println(countries.length);
		Scanner scanner = new Scanner(System.in);
		while (true) {

			System.out.println("enter country");
			String input = scanner.next();
			if (input.equals("E"))
				System.exit(0);
			boolean isfound = false;
			for (String country : countries) {
				if (country.equals(input)) {
					isfound = true;
					scanner.close();
					break;
					
				}

			}
			if (isfound) {
				System.out.println("Found");
			} else {
				System.out.println("Not found");
			}
		}
		
	}
	
 
}
