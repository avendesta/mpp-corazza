package lesson5.labs.prob4;

import java.time.LocalDate;

public class CustOrderFactory {
	

	public Order getOrderInstance(LocalDate d) {
		return new Order(d);
	}
	public Customer getCustomerInstance(String name) {
		return new Customer(name);
	}
	public static Item getItemInstance(String name) {
		// TODO Auto-generated method stub
		return new Item(name);
	}
	public Order getOrderCustomerInstance(Customer cust, LocalDate now) {
		// TODO Auto-generated method stub
		return  Order.newOrder(cust, LocalDate.now());
	}

}
