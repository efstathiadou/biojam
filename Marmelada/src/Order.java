import java.util.ArrayList;
import java.util.HashMap;

public class Order {
	protected Customer customer;
	private HashMap<String, String> finalOrder;

		
	public Order(Customer c) {
		finalOrder = new HashMap<String, String>();
		customer=c;
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
	
	public void printCreated()
	{
		System.out.println("New order of "+ this.customer.getName() + " created successfully");
	}
	
	public void printInfo()
	{
		System.out.println("-------------");
		System.out.println("Name: " + this.customer.getName());
		System.out.println("AFM: " + this.customer.getAfm());
		if ( finalOrder!=null )
		{
			System.out.println("Order: " + this.getFinalOrder());
		}
		else
			System.out.println("Order empty");
	}
}
