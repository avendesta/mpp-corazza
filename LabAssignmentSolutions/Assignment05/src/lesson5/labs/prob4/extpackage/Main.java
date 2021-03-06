package lesson5.labs.prob4.extpackage;

import java.time.LocalDate;

import lesson5.labs.prob4.*;



public class Main {
	public static void main(String[] args) {
		CustOrderFactory custOrderFactory=new CustOrderFactory();
		Customer cust = custOrderFactory.getCustomerInstance("Bob");
		
		Order order = custOrderFactory.getOrderCustomerInstance(cust, LocalDate.now());
		order.addItem("Shirt");
		order.addItem("Laptop");

		order =custOrderFactory.getOrderCustomerInstance(cust, LocalDate.now());
		order.addItem("Pants");
		order.addItem("Knife set");

		System.out.println(cust.getOrders());
	}
}

		
