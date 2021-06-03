import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		Product jam1 = new Product ("fraoula",600);
		Product jam2 = new Product ("kerasi",420);
		Product jam3= new Product ("portokali",480);
		Product jam4 = new Product ("mantarini",360);
		
		ArrayList<Product> productCatalog = new ArrayList<Product>();
		productCatalog.add(jam1);
		productCatalog.add(jam2);
		productCatalog.add(jam3);
		productCatalog.add(jam4);
		
		Customer customer1= new Customer ("Patidou Olga","046208830","DOY B Peiraia");
		Customer customer2= new Customer ("Alexiou Nikolaos","046208830","DOY B Peiraia");
		
		ArrayList<Customer> customerCatalog = new ArrayList<Customer>();
		customerCatalog.add(customer1);
		customerCatalog.add(customer1);
		
		Order order1 = new Order (customer1);
		Order order2 = new Order (customer1);
		Order order3 = new Order (customer2);
		Order order4 = new Order (customer2);
		
		order1.addProduct(jam1.getName(),"50");
		order1.addProduct(jam3.getName(), "14");
		
		
		System.out.println(order1.customer.getName()); //+" "+ order1.getFinalOrder());
		
	}

}
