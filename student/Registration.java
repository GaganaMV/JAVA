package student;

class Student{
	String name;
	int score;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
}

class ClassRoom{
	
	public String registerStudent(Student student) {
		if(!student.name.matches(".*[A-Z]+$.*")) { 
			
		return "Block letters needed";
	}
    if (student.score<0 || student.score>100) {
		return "invalid score";
	}		
	return "registerd";
  }
	public String studentCard(String card) {
		if(card.matches("\\d+")) {
		return "valid card";
	}else {
		return "invalid card";
	}
	}
	
}

public class Registration {

	public static void main(String[] args) {
		Student s=new Student("TANU", -76);
		ClassRoom c=new ClassRoom();
		System.out.println(c.registerStudent(s));
		
		
		

	}

}
