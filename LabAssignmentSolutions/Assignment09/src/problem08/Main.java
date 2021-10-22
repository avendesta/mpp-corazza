package problem08;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class Main {
	List<OrderItem> orderItems = new ArrayList<>();
	public static void main(String[] args) {
		Main m = new Main();
		List<String> z = new ArrayList<>();
		z.add("hello"); z.add("world");
		z.forEach((i)-> i.toUpperCase());
		System.out.println(z);
		m.loadOrderItemData();
		System.out.println("Do any of these Order Items have an order of flowers? " + 
		   m.findProduct("Flowers"));
	}
	
//	private boolean findProduct(String prodName) {
//		for(OrderItem item : orderItems) {
//			if(item != null) {
//				Product p=item.getProduct();
//				if(p != null) {
//					String name = p.getProductName();
//					if(name != null) {
//						if(name.equals(prodName)) return true;
//					}
//				}
//			}
//		}
//		return false;
//	}
	

	private boolean findProduct(String prodName) {
		for(OrderItem item: orderItems) {
			Optional<OrderItem> orderOItem = Optional.ofNullable(item);

			String productName = orderOItem
			.flatMap(OrderItem::getOProduct)
			.flatMap(Product::getOName)
			.orElse("");
			
			if(productName.equals(prodName)) return true;
		}
		
		return false;
	}
	
	private boolean findProduct1(String prodName) {
		for(OrderItem item : orderItems) {
			if(Optional.ofNullable(item).map((OrderItem x) -> x.getProduct())
				   .map((Product x) -> x.getProductName())
				   .orElse("").equals(prodName))  {					
				return true;
			}
		}
		return false;
}
	
	private void loadOrderItemData() {
		orderItems.add(new OrderItem(new Product("1016", "Tools", 131.00), 3));
		orderItems.add(new OrderItem(new Product("1017", "Fishing Rod", 111.00), 1));
		orderItems.add(new OrderItem(new Product("1018", "Game of Go",66.00), 2));
		orderItems.add(null);
		orderItems.add(new OrderItem(null, 9));
		orderItems.add(new OrderItem(new Product("1021", null, 269.00), 3));
		orderItems.add(new OrderItem(new Product("1019", "Flowers", 221.00), 5));
	}
}
