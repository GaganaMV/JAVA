package interfaceEx;

import java.util.Comparator;

public class AgeCompare implements Comparator<Student>{

	@Override
	public int compare(Student a, Student b) {
		return a.getAge()-b.getAge();
	}

}
