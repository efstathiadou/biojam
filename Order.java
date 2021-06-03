import java.util.ArrayList;

public class Order {
	private Customer customer;
	private ArrayList<Product> finalOrder;
	
	public Order(Customer c) {
		finalOrder = new ArrayList<>();
	}
	
	public void addProduct(Product p) {
		finalOrder.add(p);
	}
}
