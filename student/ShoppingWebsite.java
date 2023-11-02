package student;
class Customer{
	int id;
	String name;
	String address;
	double walletbalance;
	public Customer(int id, String name, String address, double walletbalance) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.walletbalance = walletbalance;
	}
	
}
class Item{
	int id;
	String name;
	String companyName;
	double price;
	boolean isInStock;
	public Item(int id, String name, String companyName, double price, boolean isInStock) {
		super();
		this.id = id;
		this.name = name;
		this.companyName = companyName;
		this.price = price;
		this.isInStock = isInStock;
	}
	

}
class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
	
	
}
class ItemOutOfStockException extends Exception{
	public ItemOutOfStockException(String msg) {
		super(msg);
	}
	
}

class Shopping{
	public String purchaceItem(Item i,Customer c) throws ItemOutOfStockException, InsufficientBalanceException {
		if(i.isInStock) {
			throw new ItemOutOfStockException("is out of stock");
		}if(i.price>c.walletbalance) {
			throw new InsufficientBalanceException("insufficient");
		}
		return "Order Successfull";
		
	}
}

public class ShoppingWebsite {

	public static void main(String[] args) throws ItemOutOfStockException, InsufficientBalanceException {
		Customer c1=new Customer(101, "tanuja", "karwar", 12000);
		Item i1=new Item(101, "phone", "IQOO", 12000, false);
		Shopping s= new Shopping();
		System.out.println(s.purchaceItem(i1, c1));
		

	}

}
