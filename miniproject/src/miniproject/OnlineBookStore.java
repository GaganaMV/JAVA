package miniproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Book {
	private String title;
	private String author;
	private double price;
	private int quantity;

	public Book(String title, String author, double price, int quantity) {
	super();
	this.title = title;
	this.author = author;
	this.price = price;
	this.quantity = quantity;
	}

	public String getTitle() {
	return title;
	}

	public void setTitle(String title) {
	this.title = title;
	}

	public String getAuthor() {
	return author;
	}

	public void setAuthor(String author) {
	this.author = author;
	}

	public double getPrice() {
	return price;
	}

	public void setPrice(double price) {
	this.price = price;
	}

	public int getQuantity() {
	return quantity;
	}

	public void setQuantity(int quantity) {
	this.quantity = quantity;
	}

	}

	class Customer {

	private String name;

	public Customer(String name) {
	this.name = name;

	}

	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	}

	class User {
	private String username;
	private String password;

	public User(String username, String password) {
	this.username = username;
	this.password = password;
	}
	public String getUsername() {
	return username;
	}
	@Override
	public int hashCode() {
	// TODO Auto-generated method stub
	return username.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
	if (this == obj)
	return true;
	if (obj == null || getClass() != obj.getClass())
	return false;
	User user = (User) obj;
	return username.equals(user.username);
	}
	}

	public class OnlineBookStore {
	private static Set<User> userdata = new HashSet<User>();
	private static List<Book> listIfBooks = new ArrayList<Book>();
	private static List<Book> cart = new ArrayList<Book>();
	private static Customer customer = null;

	public static void main(String[] args) {
	userdata.add(new User("tanuvaidya", "tanu18@216"));
	userdata.add(new User("mani", "1234"));
	System.out.println("````````````````````````````WELCOME TO OUR ONLINE BOOK STORE````````````````````````````");
	System.out.println("_________________________________________________________________________________________");
	System.out.println("                                                                                         ");
	System.out.println("----------------------------- book is best friend forever---------------------------------");
	Scanner sc = new Scanner(System.in);    
	bookServices(sc);
	// registerUser(sc);
	// loginUser(sc);

	}

	private static void registerUser(Scanner scanner, Scanner bookQnt) {
	System.out.print("Enter a username: ");
	String username = scanner.next();
	System.out.print("Enter a password: ");
	String password = scanner.next();
	User newUser = new User(username, password);
	if (userdata.contains(newUser)) {
	System.out.println("Username already exists. Please choose a different username.");
	} else {
	userdata.add(newUser);
	System.out.println("User registration successful!");
	purchaceBook(bookQnt);
	}
	}

	private static void purchaceBook(Scanner bookQnt) {
	System.out.print("Enter the title of the book you want to purchase: ");
	String bookTitle = bookQnt.next();
	if(listIfBooks.contains(bookTitle)) {
	System.out.println("Enter Quantity of book:");
	int bookQnt1 = bookQnt.nextInt();
	Iterator<Book> itr2 = cart.iterator();
	while (itr2.hasNext()) {
	Book bookToPurchase = itr2.next();
	if (bookToPurchase.getQuantity() >= bookQnt1 ) {

	System.out.println("Book Ordered successfully!");

	double total = 0;
	System.out.println("Generate Bill:");
	for (Book book : cart) {
	System.out.println("Book Name:" + book.getTitle());
	System.out.println("Quantity:" + bookQnt1);
	total += bookToPurchase.getPrice() * bookQnt1;

	}
	System.out.println("Total $:" + total);
	} else {

	System.out.println("Book Quantity is not avilable in the cart!");

	}
	}

	}else {
	System.out.println("Book is not avilable in the cart!.. please enter valid book name");
	}

	}






	private static void loginUser(Scanner scanner, Scanner bookQnt) {
	System.out.print("Enter your username: ");
	String username = scanner.next();

	System.out.print("Enter your password: ");
	String password = scanner.next();

	User loginuser = new User(username, password);
	if (userdata.contains(loginuser) && userdata.contains(loginuser)) {
	System.out.println("Login Successful.");
	purchaceBook(bookQnt);

	} else {
	System.out.println("Invalid username or password");
	System.out.println("Please enter valid username or password");

	}
	}

	private static void bookServices(Scanner sc) {
	listIfBooks.add(new Book("core", "Jon", 550, 10));
	listIfBooks.add(new Book("python", "libert", 552, 19));
	listIfBooks.add(new Book("javaScript", "Jon", 450, 50));

	while (true) {
	System.out.println("______________________________________________________________________");
	System.out.println("| Enter your Choice              |");
	System.out.println("| 1.view avilable books              |");
	System.out.println("|       2.filter                                                      |");
	System.out.println("| 3.Searchbooks |");
	System.out.println("| 4.Add to Cart |");
	System.out.println("| 5.view Cart |");
	System.out.println("| 6.Purchace a book |");
	System.out.println("| 7.Exit |");
	System.out.println(".....................................................................");
	int choice = sc.nextInt();

	switch (choice) {
	case 1:
	System.out.println("Available Books Are : ");
	System.out.println();
	Iterator<Book> itr = listIfBooks.iterator();
	while (itr.hasNext()) {
	Book book = (Book) itr.next();
	System.out.println(book.getTitle());
	System.out.println("  Author:" + book.getAuthor());
	System.out.println("  Price:" + book.getPrice());
	System.out.println("  Available Quantity:" + book.getQuantity());
	System.out.println(" ");
	}
	System.out.println();
	break;
	case 2:
	System.out.println("enter amount to filter");
	int filter = sc.nextInt();
	List<Book> collect =listIfBooks.stream().filter(x->x.getPrice()<=filter).collect(Collectors. toList());
	Iterator<Book> itr1 = collect.iterator();
	   while(itr1.hasNext()) {
	    Book book = itr1.next();
	    System.out.println(book.getTitle());
	    System.out.println(book.getAuthor());
	    System.out.println(book.getPrice());
	    System.out.println(book.getQuantity());
	   }

	break;
	case 3:

	boolean found = false;
	System.out.println("enter book name to search");
	String search = sc.next();
	Iterator<Book> books = listIfBooks.iterator();
	while (books.hasNext()) {
	Book search1 = books.next();
	String title = search1.getTitle();
	if (title.equals(search)) {
	System.out.println("Book found :" + search);
	System.out.println("Author : " + search1.getAuthor());
	System.out.println("Book price :" + search1.getPrice());
	System.out.println("available books : " + search1.getQuantity());
	System.out.println();
	found = true;
	}
	}
	if (!found) {
	System.out.println("Book Not Found!");
	}
	break;

	case 4:

	addToCart(sc);
	break;
	case 5:
	if(cart.isEmpty()) {
	System.out.println("No Book added in the cart");
	}

	System.out.println("view cart");
	Iterator<Book> iterator = cart.iterator();
	while (iterator.hasNext()) {
	Book next = iterator.next();
	System.out.println("Book:" + next.getTitle());
	System.out.println("Author" + next.getAuthor());
	System.out.println("Price" + next.getPrice());
	System.out.println("Quantity" + next.getQuantity());
	}
	break;
	case 6:
	if(cart.isEmpty()) {
	System.out.println("No Book added in the cart");
	System.out.println("please add the book to cart!!");
	}else {
	bookPurchace(sc,sc);
	}

	break;
	case 7:
	System.out.println("Thank you for visiting the Online Book Store!");
	break;

	default:
	System.out.println("Invalid choice please Try agian!");

	}

	}

	}

	private static void bookPurchace(Scanner sc,Scanner bookQnt) {
	String bookTitle;

	System.out.println("a.Register");
	System.out.println("b.Login");
	System.out.println("Register | Login");
	String choice = sc.next();
	switch (choice) {
	case "a":
	registerUser(sc, bookQnt);

	break;
	case "b":
	loginUser(sc, bookQnt);

	break;
	default:
	System.out.println("invalid choice");
	}
	}
	
	
	private static void addToCart(Scanner sc) {
	boolean found = false;
	System.out.println("enter book name");
	String search = sc.next();
	
	if (listIfBooks.contains(search)) {
	System.out.println("enter Quantity");
	int qnt = sc.nextInt();
	Iterator<Book> books = listIfBooks.iterator();
	while (books.hasNext()) {
	Book search1 = books.next();
	String title = search1.getTitle();
	int quantity = search1.getQuantity();
	if (title.equals(search) && qnt != 0 && qnt<=quantity) {
	cart.add(new Book(search1.getTitle(), search1.getAuthor(), search1.getPrice(), qnt));

	System.out.println("Book added to cart successfully!");
	System.out.println();
	found = true;
	}
	}
	if (!found) {
	System.out.println("Only 10 books are avilable");
	}
	}else {
	System.out.println("Book not found");
	}


	}

	// private static void addToCart(Scanner sc) {
	// boolean found = false;
	// System.out.println("enter book name");
	// String search = sc.next();
	// System.out.println("enter Quantity");
	// int qnt = sc.nextInt();
	// Iterator<Book> books = listIfBooks.iterator();
	// while (books.hasNext()) {
	// Book search1 = books.next();
	// String title = search1.getTitle();
	// int quantity = search1.getQuantity();
	// if (title.equals(search) && qnt != 0 && qnt<=quantity) {
	// cart.add(new Book(search1.getTitle(), search1.getAuthor(), search1.getPrice(), qnt));
	//
	// System.out.println("Book added to cart successfully!");
	// System.out.println();
	// found = true;
	// }
	// }
	// if (!found) {
	// System.out.println("Book Not Found!");
	// }
	//
	// }



}

