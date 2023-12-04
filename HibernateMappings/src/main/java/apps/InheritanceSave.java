package apps;




//2. Create Emp class having information as id(int), name(String), email(String), contactno(string) and basic(float) .
//Inherit this class to create PermanentEmp having information as , allowances(float), bonus(float) and deductions(float) 
//and TemporaryEmp having information as extrapay(float) and taxes(float) .
//Use hibernate DDL auto functionality to create required tables. Use JOINED strategy for inheritance.


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.*;

public class InheritanceSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//opening some services
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		//read info from xml file
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
		
		//establish connection to database
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
		
		Session session=sf.openSession();
		
		
		Emp e1=new PermanentEmp("H",10000.00f,7980.00f);
		Emp e2=new ContractEmp("Shahi",34,879.00f);
		
		Transaction tr = session.beginTransaction();
		session.save(e1);
		session.save(e2);
		
		tr.commit();
		
		System.out.println("Emp saved");
		
		session.close();
		
		sf.close();
	}

}
