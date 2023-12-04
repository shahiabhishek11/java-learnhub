package A3;

import java.io.Serializable;

public class Customer implements Serializable  {

	private String name;
	private int number;
	private String email;
	
	public Customer(String name, int number, String email) {
		super();
		this.name = name;
		this.number = number;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", number=" + number + ", email=" + email + "]";
	}
	
	
	
	
}
