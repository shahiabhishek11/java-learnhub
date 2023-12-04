package apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.ContractEmp;
import entities.Emp;
import entities.PermanentEmp;

public class InheritanceFetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		//read info from xml file
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
		
		//establish connection to database
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
		
		Session session=sf.openSession();
		
		
		Emp e1=session.get(PermanentEmp.class,1);
		Emp e2=session.get(ContractEmp.class,2);
		Emp e3=session.get(ContractEmp.class,4);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		session.close();
		sf.close();
		
		
		
		
		
		
	}

}
