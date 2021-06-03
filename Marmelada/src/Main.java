import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		Product jam1 = new Product ("fraoula",600);
		Product jam2 = new Product ("kerasi",420);
		Product jam3= new Product ("portokali",480);
		Product jam4 = new Product ("mantarini",360);
		
		jam1.printCreated();
		jam2.printCreated();
		jam3.printCreated();
		jam4.printCreated();

		
		ArrayList<Product> productCatalog = new ArrayList<Product>();
		productCatalog.add(jam1);
		productCatalog.add(jam2);
		productCatalog.add(jam3);
		productCatalog.add(jam4);
		
		Customer customer1= new Customer ("Patidou Olga","046208830","DOY B Peiraia");
		Customer customer2= new Customer ("Alexiou Nikolaos","046208830","DOY B Peiraia");
		
		customer1.printCreated();
		customer2.printCreated();

		ArrayList<Customer> customerCatalog = new ArrayList<Customer>();
		customerCatalog.add(customer1);
		customerCatalog.add(customer1);
		
		Order order1 = new Order (customer1);
		Order order2 = new Order (customer1);
		Order order3 = new Order (customer2);
		Order order4 = new Order (customer2);
		
		ArrayList<Order> ordersList =new ArrayList<Order>();
		
		order1.addProduct(jam1.getName(),"50");
		order1.addProduct(jam3.getName(), "14");
		
		order2.addProduct(jam4.getName(),"150");
		order2.addProduct(jam3.getName(),"45");
		
		order3.addProduct(jam2.getName(),"80");
		order3.addProduct(jam3.getName(),"35");
		order3.addProduct(jam1.getName(),"28");
		
		order4.addProduct(jam4.getName(),"60");
		
		ordersList.add(order1);
		ordersList.add(order2);
		ordersList.add(order3);
		ordersList.add(order4);
		
		order1.printCreated();
		order2.printCreated();
		order3.printCreated();
		order4.printCreated();
		
		order2=null;
		System.out.println("Order2 deleted ");
		
		ordersList.remove(order2);
		
		System.out.println("Orders List: ");
		for(int i=0; i<ordersList.size();i++)
		{
			ordersList.get(i).printInfo();
		}
		
		System.out.println("Product Catalogue: ");
		for(int i=0; i<productCatalog.size();i++)
		{
			productCatalog.get(i).printInfo();
		}
		
		System.out.println("Customers Catalogue: ");
		for(int i=0; i<customerCatalog.size();i++)
		{
			customerCatalog.get(i).printInfo();
		}
		
		
	}

	
}
