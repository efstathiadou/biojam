
public class Customer {

	public String name;
	public String afm;
	public String adress;

	public Customer(String text1, String text2, String text3) {
		super();
		this.name = text1;
		this.afm = text2;
		this.adress = text3;
	}

	
	
	public String getName() {
		return name;
	}
	public String getAfm() {
		return afm;
	}
	public String getAdress() {
		return adress;
	}
	
}
