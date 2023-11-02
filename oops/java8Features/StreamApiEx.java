package java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
	int eId;
	String eName;
	int salary;
	String designation;
	public Employee(int eId, String eName, int salary,String designation) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
		this.designation=designation;
		
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDesignation() {
		return salary;
	}
	public void setDesignationy(String designation) {
		this.designation= designation;
	}
	
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", salary=" + salary + "]";
	}
	
	
}

public class StreamApiEx {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(6);
		System.out.println(list);
		List<Integer> collect = list.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(collect);
		List<Integer> collect2 = list.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(collect2);
		
		
		
		ArrayList<Employee> employeeList=new ArrayList<Employee>();
		employeeList.add(new Employee(1, "tanuja", 40000,"java Developer"));
		employeeList.add(new Employee(2, "sahana", 50000,"software Developer"));
		employeeList.add(new Employee(3, "manish", 60000,"front end Developer"));
		employeeList.add(new Employee(4, "trupti", 80000,"full satck Developer"));
		employeeList.add(new Employee(5, "manya", 90000,"javascript Developer"));
		
	   List<String> lists=Arrays.asList("tanuja","taidya","tahana");
	   System.out.println(lists.stream().allMatch(a->a.startsWith("t")));
	   
	   
	   List<String> collect6 = lists.stream().sorted().collect(Collectors.toList());
	   
	   List<String> collect5 = lists.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect5);
		System.out.println(employeeList);
		long count = employeeList.stream().count();
		System.out.println(count);
		List<Employee> collect3 = employeeList.stream().filter(a->a.geteName().startsWith("t")).collect(Collectors.toList());
		System.out.println(collect3);
		Optional<Employee> collect4 = employeeList.stream().collect((Collectors.maxBy(Comparator.comparingDouble(a->a.salary))));
		
		System.out.println(collect4);
		Optional<Employee> max = employeeList.stream().max((o1, o2) -> o1.getSalary()-o2.getSalary());
		Optional<Employee> min = employeeList.stream().min((a, b) -> a.getSalary()-b.getSalary());
		Optional<Employee> findFirst = employeeList.stream().findFirst();
		System.out.println(max);
		System.out.println(min);
		System.out.println(findFirst);
		
		 List<Employee> sorted = employeeList.stream().sorted((o1, o2) -> o1.getDesignation()-o2.getDesignation()).collect(Collectors.toList());
		System.out.println(sorted);
		
		System.out.println(collect6);
		
		
		
		
		
		
		
		
		
				
		
		

	}

}
