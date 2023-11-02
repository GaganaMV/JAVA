package oops.inheritence;

public class StudentDetails implements  CollegeData,HostelData{

	public static void main(String[] args) {
		StudentDetails s=new StudentDetails();
		s.hostelDetail();
		s.studentRecord();
		s.collegeDetail();
		s.studentDtail();
	}

	@Override
	public void hostelDetail() {
		System.out.println("Backward classes welfare ");
		
	}

	@Override
	public void studentRecord() {
		System.out.println("Name : Tanuja");
		
	}

	@Override
	public void collegeDetail() {
		System.out.println("Government Engineering college");
		
	}

	@Override
	public void studentDtail() {
		System.out.println("cource name: Computer science and Engineering");
		
	}

	

	

}
