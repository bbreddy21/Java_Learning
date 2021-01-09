package com.simplilearn.arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] intarray = { 10, 20, 30, 40, 50, 60, 70 };
		for (int iarr : intarray) {
			System.out.println(iarr);
		}

		// way1
		int[] a1 = new int[2];
		a1[0] = 10;
		a1[1] = 20;
		for (int i = 0; i < a1.length; i++) {

			System.out.println(a1[i]);
		}

		// way2
		// int a2[] = new int[5];

		// way3
		int[] a3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, };
		int size = a3.length;
		for (int i = 0; i < size; i++) {

			System.out.println(a3[i]);
		}

		// way4
		//int a4[] = new int[] { 1, 2, 3, 5, 6, 7, 8, 9 };

	}

}
