import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Product jam1 = new Product ("fraoula",600);
		Product jam2 = new Product ("kerasi",420);
		Product jam3= new Product ("portokali",480);
		Product jam4 = new Product ("mantarini",360);
		
		Customer customer1= new Customer ("Patidou Olga","046208830","DOY B Peiraia");
		Customer customer2= new Customer ("Alexiou Nikolaos","046208830","DOY B Peiraia");
		
		Order order1 = new Order (customer1);
		Order order2 = new Order (customer1);
		Order order3 = new Order (customer2);
		Order order4 = new Order (customer2);
		
		ArrayList<Product> orderlist = new ArrayList<Product>();
		orderlist = order1.getFinalOrder();
				
		order1.addProduct(jam1);
		
		
		for(int i=0;i<orderlist.length();i++){
		System.out.println( orderlist.get(i).name);
		}
	}

}
