package programming;

public class StudentEx {
	int rno;
	String sname;
	
	StudentEx(){
		rno=2;
		sname="tanuja vaidya";
	}
	
	StudentEx(int rno, String sname){
		this.rno=rno;
		this.sname=sname;
	}
	StudentEx(StudentEx s1){
		rno=2;
		sname="tanuja";
	}
	
	
		
	
	
	
	void display() {
		System.out.println("Student Roll number:"+rno);
		System.out.println("Stent name: "+sname);
	}
	public static void main(String[] args) {
		StudentEx s=new StudentEx();
		s.display();
		StudentEx s1=new StudentEx(3,"sahana");
		s1.display();
		StudentEx s2=new StudentEx(s1);
		s2.display();
	}

}
