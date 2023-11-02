package interfaceEx;

import java.time.LocalDate;

public class Employee {
	private String name;
	private int salary;
	private LocalDate dateOfJoin;
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", dateOfJoin=" + dateOfJoin + "]";
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public LocalDate getDateOfJoin() {
		return dateOfJoin;
	}
	public Employee(String name, int salary, LocalDate dateOfJoin) {
		super();
		this.name = name;
		this.salary = salary;
		this.dateOfJoin = dateOfJoin;
	}
	
	
	

}
