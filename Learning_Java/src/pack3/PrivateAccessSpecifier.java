package pack3;

public class PrivateAccessSpecifier {

	private void welcome() {

		System.out.println("I m private method");
	}

	public static void main(String[] args) {

		PrivateAccessSpecifier priv = new PrivateAccessSpecifier();
		priv.welcome();

	}
	
	
}
