 package JavaPrograms;

public class Student {
	
	int age;
	int rollno;
	
	public void display1() {
		
		System.out.println("This is first method");

	}
	
	public void display2() {
		
		System.out.println("This is second method");
	}
	
	public static void main(String[] args) {
		
		Student obj1= new Student();
		
		
		obj1.age=12;
		obj1.rollno=20;
		System.out.println("Student age is " +obj1.age);
		System.out.println("Student roll no. is " + obj1.rollno);
		obj1.display1();
		obj1.display2();
		
		
		Student obj2= new Student();
		obj2.age=24;
		obj2.rollno=25;
		System.out.println("Student age is " +obj2.age);
		System.out.println("Student roll no. is " + obj2.rollno);
		obj2.display1();
		obj2.display2();
	}
}
