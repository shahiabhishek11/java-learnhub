package A4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import A3.Customer;
import A3.RegCustomer;

public class demoDeserilization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		
		List<Customer> sc=new ArrayList<>();
		
		List<RegCustomer>scr=new ArrayList<>();
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\Files\\harsha.txt"));
		boolean f=true;
		while(f) 
		{
		//	System.out.println("idshfhdsjhfn");
			
		try {
			Object o=ois.readObject();
			if(o instanceof RegCustomer )
			{
				scr.add((RegCustomer) o);
			}
		
		else //if(o instanceof Customer )
		{
			sc.add((Customer) o);
		}
		
		}
		catch(Exception e)
		{
			break;
		}
		
		}
		
		System.out.println(sc);
		System.out.println("*******************");
		System.out.println(scr);
	

	}

}
