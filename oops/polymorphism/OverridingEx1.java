package oops.polymorphism;

class Exam{
	int marks =39;
	
	void marks(int marks) {
		System.out.println("marks: " +marks);
	}
	
	int totalMarks(int a,int b) {
		return a+b;
	}
	double percent() {
		return 77.5;
	}
	
}

class Marks extends Exam{
	@Override
	void marks(int marks) {
		System.out.println("alternative marks :"+marks);
		
	}
	
	@Override
	double percent() {
		return 99.8;
	}
	
	@Override
	int totalMarks(int a, int b) {
		return a*b;
	}
}


public class OverridingEx1 {

	public static void main(String[] args) {
		//class casting
		Exam m = new Marks();
		m.marks(80);
		double percent = m.percent();
		System.out.println(percent);
		int totalMarks = m.totalMarks(23, 10);
		System.out.println(totalMarks);

	}

}
