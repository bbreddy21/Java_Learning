package com.simplilearn.arrays;

public class TwoDimensionArrayDemo {

	public static void main(String[] args) {
		int[][] intarrays = new int[2][3];
		intarrays[0][0] = 10;
		intarrays[0][1] = 20;
		intarrays[0][2] = 30;
		intarrays[1][0] = 40;
		intarrays[1][1] = 50;
		intarrays[1][2] = 60;

		System.out.println(intarrays.length);
		System.out.println(intarrays[1].length);
		for (int i = 0; i < intarrays.length; i++) {
			for (int j = 0; j < intarrays[i].length; j++) {
				System.out.println(intarrays[i][j]);

			}

		}

		int[][] ints2 = { { 11, 12 }, { 13, 14, 15 } };
		System.out.println("Row Lenght" + ints2.length);
		System.out.println("Coloumn Length" + ints2[0].length);
		System.out.println("Coloumn Length" + ints2[1].length);

		
	}

}
