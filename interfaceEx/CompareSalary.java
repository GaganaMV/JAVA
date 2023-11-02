package interfaceEx;

import java.util.Comparator;

public class CompareSalary implements Comparator<Employee>{

	@Override
	public int compare(Employee a, Employee b) {
		
		return a.getSalary()-b.getSalary();
	}

}
