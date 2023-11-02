package interfaceEx;

import java.util.Date;

public class Movie implements Comparable<Movie>{
	private String name;
	private String city;
	private int year;
	public Movie(String name, String city, int year) {
		super();
		this.name = name;
		this.city = city;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public int getYear() {
		return year;
	}
	@Override
	public int compareTo(Movie m) {
		
		return this.year-m.year;
	}
	
	

}
