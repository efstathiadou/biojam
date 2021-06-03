import java.util.ArrayList;
import java.util.HashMap;

public class Order {
	private Customer customer;
	private HashMap<String, String> finalOrder;
	
	public Order(Customer c) {
		finalOrder = new HashMap<String, String>();
	}

	public void addProduct(String p, String q) {
		finalOrder.put(p,q);
	}
	
	////////set & get////////
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public HashMap<String, String> getFinalOrder() {
		return finalOrder;
	}

	public void setFinalOrder(HashMap<String, String> finalOrder) {
		this.finalOrder = finalOrder;
	}

}
