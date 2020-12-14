package assignments;

import java.util.Scanner;

public class SimpleCalculatoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter First Number");
		int number1 = myObj.nextInt();
		
		System.out.println("Enter Second Number");
		int number2 = myObj.nextInt();
		
		SimpleCalculator sc = new SimpleCalculator();
		int addnum = sc.add(number1, number2);
		System.out.println("Addition of given numbers is : " + addnum);
		
		int diffnum = sc.sub(number1, number2);
		System.out.println("Subraction of given numbers is : " + diffnum);
		
		int mulnum = sc.mul(number1, number2);
		System.out.println("Multiplication of given numbers is : " + mulnum);
		
		int divnum = sc.div(number1, number2);
		System.out.println("Division of given numbers is : " + divnum);
		
		myObj.close();

	}

}
