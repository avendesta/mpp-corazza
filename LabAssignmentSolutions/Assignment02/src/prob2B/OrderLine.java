package prob2B;

public class OrderLine {
	private Order parentOrder;
	private static Integer totalLines = 0;
	private Integer lineNumber; // I added this myself, just to identify each OrderLine object
	
	// package level constructor because OrderLine can only exist inside an Order
	OrderLine(Order order){
		parentOrder = order;
		lineNumber = totalLines;
		totalLines++;
	}
	public Integer getLineNumber() {
		return lineNumber;
	}
	public Order getParentOrder() {
		return parentOrder;
	}
	@Override
	public String toString() {
		return String.format("OrderLine-%s", lineNumber);
	}
}
