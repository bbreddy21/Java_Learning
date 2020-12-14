import java.util.Scanner;

public class Student {

	int studentID;
	String studentname;
	boolean assignmentstatus;

	Student(int id, String name) {

		this.studentID = id;
		this.studentname = name;

	}

	Student(int id, String name, boolean status) {

		this(id, name);
		this.assignmentstatus = status;

	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentname=" + studentname + ", assignmentstatus="
				+ assignmentstatus + "]";
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1 = new Student();
		System.out.println(student1);
		Student student2 = new Student(10, "bbreddy");
		System.out.println(student2);
		Student student3 = new Student(20, "bramhi", true);
		System.out.println(student3);
		System.out.println("Enter the student name");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("Enter the student ID");
		int id = scanner.nextInt();
		Student student4 = new Student(id, name, true);
		System.out.println(student4);
		scanner.close();

	}

}
