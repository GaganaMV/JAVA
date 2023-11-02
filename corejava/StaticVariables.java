package corejava;

class Student{
	public static int fee;
	public static String course="python";
}

public class StaticVariables {
	public static String name;
	public static int age;
	public static void main(String[] args) {
		StaticVariables.name="tanuja";
		Student.fee=1000;
		StaticVariables.age=34;
		Student.course="java";
		System.out.println("Name :" +StaticVariables.name);
		System.out.println("Fees :"+Student.fee);
		System.out.println("Course :"+Student.course);
	}

}
