package apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Student;

public class CompisitionFetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//opening some services
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		//read info from xml file
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
		
		//establish connection to database
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
		
		Session session=sf.openSession();
		
		Student s=session.get(Student.class,1);
		
		if(s!=null)
		{
			System.out.println(s.getAddress().getArea());
		}
		else
		{
			System.out.println("Does not exists");
		}
		
		
	}

}
