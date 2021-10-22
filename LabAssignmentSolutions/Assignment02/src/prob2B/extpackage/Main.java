package prob2B.extpackage;

import prob2B.Order;
import prob2B.OrderLine;

public class Main {

	public static void main(String[] args) {
		Order myOrder = new Order(13);
		
		myOrder.addOrderLine();
		myOrder.addOrderLine();
		myOrder.addOrderLine();
		myOrder.addOrderLine();
		
		System.out.println("The order number is: "+myOrder.getOrderNumber());
//		OrderLine ol = myOrder.getOrderLine(3);
//		System.out.println(ol);
		System.out.println(myOrder.getOrderLines());
		System.out.println(myOrder.getOrderLines().get(0).getParentOrder().getOrderNumber());
	}

}
