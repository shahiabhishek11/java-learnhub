package apps;

//1. Create Student class having information as 
//id(int), name(String and address(Address). Use Address as embeddable entity.

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Address;

import entities.Student;

public class CompositionRelation {
public static void main(String[] args) {
		
		//1. creating session factory
		//opening some services
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		//read info from xml file
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
		
		//establish connection to database
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
		
		Session session=sf.openSession();
		Student s1=new Student("Harsha",new Address("Mhow","Indore","454441"));
			
		Transaction tr=session.beginTransaction();
		
		session.save(s1);
		
		tr.commit();
		
		System.out.println();

		
		
}
}
