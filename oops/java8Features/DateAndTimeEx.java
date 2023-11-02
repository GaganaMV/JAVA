package java8Features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateAndTimeEx {

	public static void main(String[] args) {
		LocalDate firstDay_2023 = LocalDate.of(2023, Month.JANUARY, 1);
		System.out.println("Specific Date="+firstDay_2023);
		LocalDate birthDate = LocalDate.of(2000, Month.OCTOBER, 21);
		System.out.println("My Birth Date:"+birthDate);
		LocalTime now = LocalTime.now();
		System.out.println(now);
		LocalDateTime now2 = LocalDateTime.now();System.out.println();
		System.out.println(now2);
		System.out.println(LocalDateTime.of(birthDate, now));
		
	}

}
