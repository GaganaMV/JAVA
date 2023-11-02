package special;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Book{
	private int biikId;
	private String bookName;
	private double bookPrice;
	public Book(int biikId, String bookName, double bookPrice) {
		super();
		this.biikId = biikId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	public int getBiikId() {
		return biikId;
	}
	public void setBiikId(int biikId) {
		this.biikId = biikId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "Book [biikId=" + biikId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
	
	
	
	
}

public class CrudOperation {

	public static void main(String[] args) {
		
		ArrayList<Book> listOfBooks=new ArrayList<Book>();
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter Your Choice");
			System.out.println("1. add Book ");
			System.out.println("2.Display Book");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter book number");
				int bookId=sc.nextInt();
				System.out.println("Enter book Name");
				String bookName = sc.nextLine();
				sc.nextLine();
				System.out.println("Enter book price");
				double bookPrice = sc.nextDouble();
				Book books=new Book(bookId, bookName, bookPrice);
				listOfBooks.add(books);
				break;
			case 2:
				Iterator<Book> itr=listOfBooks.iterator();
				while (itr.hasNext()) {
					Book next = itr.next();
					System.out.println(next);
				}

			default:
				break;
			}
		} while (choice!=0);
		 System.out.println("input mismatch");

	}

}
