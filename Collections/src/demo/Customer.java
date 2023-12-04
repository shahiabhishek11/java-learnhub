package demo;

public class Customer implements Comparable<Customer>{

	int custid;
	String cname,email,city;
	public Customer(int custid, String cname, String email, String city) {
		super();
		this.custid = custid;
		this.cname = cname;
		this.email = email;
		this.city = city;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", cname=" + cname + ", email=" + email + ", city=" + city + "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
	//return super.hashCode();
		int ccode = 0;
			if(city.equals("Pune"))
					ccode=10;
			else if(city.equals("Mumbai"))
				ccode=20;
				else if(city.equals("Delhi"))
					ccode=40;
			return ccode;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//compare between this and obj
			Customer c=null;
		if(obj instanceof Customer)
		{
			c=(Customer)obj;
			
		}
		boolean flag=false;
		
		if(this.custid ==c.custid )
			flag=true;
		
			return flag;
	}
	
	
	public int compareTo(Customer o)
	{
		
	//	return this.cname.equals(o.cname);
		
		int diff=this.city.compareTo(o.city);
		
		if(diff==0)
			diff=this.custid-o.custid;
		
		return diff;
	}
	
}
