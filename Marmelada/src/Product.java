
public class Product {
	private String name;
	private int quantity;
	
	public Product(String text1, int text2)
	{
		name = text1;
		quantity = text2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}