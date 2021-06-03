
public class Customer {

	protected String name;
	protected String afm;
	protected String adress;

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
	
	public void printCreated()
	{
		System.out.println("Object "+ this.name + "created successfully");
	}
	
	public void printInfo()
	{
		System.out.println("-------------");
		System.out.println("Name: " + this.getName());
		System.out.println("AFM: " + this.getAfm());
		System.out.println("Adress: " + this.getAdress());
	}
	
}
