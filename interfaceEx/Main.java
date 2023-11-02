package interfaceEx;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee("Tanuja", 20000, LocalDate.of(2022, 12, 21)));
		list.add(new Employee("sahana", 40000, LocalDate.of(2021, 11, 20)));
		list.add(new Employee("Manish", 50000, LocalDate.of(2000, 8, 11)));
		list.add(new Employee("Trupti", 60000, LocalDate.of(2022, 9, 3)));
		
		System.out.println("Sort By Name:");
		Collections.sort(list,new CompareName());
		for (Employee employee : list) {
			System.out.println(employee.getName()+"  "+employee.getSalary()+"  "+ employee.getDateOfJoin());
		}
		
		
		System.out.println();
		
		System.out.println("Sort By Salary:");
		Collections.sort(list,new CompareSalary());
		for (Employee employee : list) {
			System.out.println(employee.getName()+"  "+employee.getSalary()+"  "+ employee.getDateOfJoin());
		}
		System.out.println();
		
		
		System.out.println("Sort By Date of Joining:");
		Collections.sort(list,new CompareDOfJoin());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
		
		

	}

}
