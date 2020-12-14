
public class MethodDemo {
	
	//Called Method
	private  int sum(int a, int b) {
		int c = a+b;
		return c;
	}

	//Calling Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;
		//Instantiate an object of MethodDemo Class
		MethodDemo md = new MethodDemo();
		//static refrence MethodDemo.sum(num1, num2);
		int sum = md.sum(num1, num2);
		System.out.println("Sum of Numbers is : " + sum);

	}

}
