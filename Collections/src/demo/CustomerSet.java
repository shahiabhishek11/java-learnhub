package demo;

import java.util.HashSet;
import java.util.Set;

public class CustomerSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Customer>cust = new HashSet<>();
		
		cust.add(new Customer(1,"jhsj","kdhfj","Pune"));
		cust.add(new Customer(2,"jhsj","kdhfj","Pune"));
		cust.add(new Customer(3,"jhsj","kdhfj","Mumbai"));
		cust.add(new Customer(4,"jhsj","kdhfj","Delhi"));
		cust.add(new Customer(5,"jhsj","kdhfj","Delhi"));
		
		
		for(Customer c:cust)
		{
			System.out.println(c);
		}
		
		if(cust.contains(new Customer(5,"jhsj","kdhfj","Delhi")))
		{
			System.out.println("Present");
		}
		
		System.out.println("__*******************");
		Customer c1=new Customer(5,"jhsj","kdhfj","Delhi");
		Customer c2=new Customer(5,"jhsj","kdhfj","Delhi");
		
		System.out.println(c1==c2);
		
		System.out.println(c1.equals(c2));
		
	}

}
