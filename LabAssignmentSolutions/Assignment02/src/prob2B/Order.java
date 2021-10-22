package prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private Integer orderNumber;
	private List<OrderLine> OrderLineList = new ArrayList<>();
	
	public Order(Integer orderNumber) {
		this.orderNumber = orderNumber;
		// adding at least one orderline to the list when order is created
		addOrderLine(); // this is required because its 1 to 1..* relation, and not 1 to 0..*
	}
	
	public void addOrderLine() {
		OrderLine orderLine = new OrderLine(this);
		OrderLineList.add(orderLine);
	}
	
	public OrderLine getOrderLine(Integer orderLineNumber) {
		return OrderLineList.get(orderLineNumber);
	}

	public List<OrderLine> getOrderLines() {
		return OrderLineList;
	}
	
	@Override
	public String toString() {
		return OrderLineList.toString();
	}

	public Integer getOrderNumber() {
		return orderNumber;
	}
	
}
