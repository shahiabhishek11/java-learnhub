package A3;

public class RegCustomer extends Customer {
	
	int regno;

	public RegCustomer(String name, int number, String email,int regno) {
		super(name, number, email);
		// TODO Auto-generated constructor stub
		this.regno=regno;
	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	@Override
	public String toString() {
		return "RegCustomer \n [regno=" + regno + "Name=" + getName() + "Number=" + getNumber()
				+ "Email=" + getEmail() + "]";
	}

	
	
	

}
