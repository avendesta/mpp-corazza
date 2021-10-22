package lesson5.labs.prob4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;




public class Order {
	private LocalDate orderDate;
	private List<Item> items;
	

	//use a factory method
	public Order(LocalDate orderDate) {
		this.orderDate = orderDate;
		items = new ArrayList<Item>();	
	}
	public static Order newOrder(Customer cust, LocalDate date) {
		if(cust == null) throw new NullPointerException("Null customer");
		CustOrderFactory custOrderFactory = new CustOrderFactory();
		Order ord = custOrderFactory.getOrderInstance(date);
		
		cust.addOrder(ord);
		return ord;
	}
	public void addItem(String name){
		items.add(CustOrderFactory.getItemInstance(name));
	}
	@Override
	public String toString() {
		return orderDate + ": " + 
	              items.toString();
	}
	
	
	

}
