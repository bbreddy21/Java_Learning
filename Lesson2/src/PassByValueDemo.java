
public class PassByValueDemo {

	int value = 100;

	private  int changevalue(int a) {
        a = a + 100;
		//this.value = a ;
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PassByValueDemo valuedemo = new PassByValueDemo();
		System.out.println("Before Calling the Method : " + valuedemo.value);
		valuedemo.changevalue(valuedemo.value);
		System.out.println("After Calling the Method : " + valuedemo.value);

	}

}
