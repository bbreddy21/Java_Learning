
public class MethodOverloadingDemo {

	// Calculate area of rectangle
	private void area(int length, int breadth) {

		System.out.println("Area of Rectangle : " + (length * breadth));
	}

	// Calculate area of circle
	public double area(int radious) {

		return Math.PI * radious * radious;
	}

	// Calculate area of square
	void area(double length) {

		System.out.println("Area of square: " + (length * length));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instantiate an object
		MethodOverloadingDemo mod = new MethodOverloadingDemo();
		mod.area(30, 40);
		double areaofcirlce = mod.area(25);
		System.out.println("Area of circle: " + areaofcirlce);
		mod.area(25.05);

	}

}
