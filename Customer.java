
public class Customer {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAfm() {
		return afm;
	}

	public void setAfm(String afm) {
		this.afm = afm;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	private String name;
	private String afm;
	private String adress;

	public Customer(String text1, String text2, String text3) {
		super();
		this.name = text1;
		this.afm = text2;
		this.adress = text3;
	}
}
