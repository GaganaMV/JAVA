package interfaceEx;

import java.util.Comparator;

public class CompareDOfJoin implements Comparator<Employee>{

	@Override
	public int compare(Employee a, Employee b) {
		
		return a.getDateOfJoin().compareTo(b.getDateOfJoin());
	}

}
