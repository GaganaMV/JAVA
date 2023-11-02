package java8Features;

import java.util.Arrays;
import java.util.List;

public class MethodRefernce {

	public static void main(String[] args) {
		List<Integer> intSeq1 = (List<Integer>) Arrays.asList(1,2,3);

		

		 intSeq1.forEach(x -> System.out.println(x));

		 System.out.println("++++++++++++");

		 intSeq1.forEach(System.out::println);

//lambda expression with method reference(::) to improve readability

	}

}
