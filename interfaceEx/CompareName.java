package interfaceEx;

import java.util.Comparator;

public class CompareName implements Comparator<Employee>{

	@Override
	public int compare(Employee a, Employee b) {
		return a.getName().compareTo(b.getName());
	}

}
