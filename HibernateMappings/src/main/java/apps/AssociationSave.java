package apps;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.OrderItem;
import entities.Orders;

public class AssociationSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		//read info from xml file
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
		
		//establish connection to database
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
		
		Session session=sf.openSession();
		
		/*Orders order=session.get(Orders.class, 1);
		
		OrderItem oi=new OrderItem(6,75,order);
		
		Transaction tr=session.beginTransaction();
				
		
		session.save(oi);
		
		tr.commit();
		System.out.println("Saved");
		
		
		
		//Saving master with child
		Orders order=new Orders("Abhis");
		Set<OrderItem>items=new HashSet();
		items.add(new OrderItem(8,40,order));
		items.add(new OrderItem(2,450,order));
		order.setItems(items);
		
		Transaction tr=session.beginTransaction();
		
		session.save(order);
		
		tr.commit();*/
		
		//saving child with master
		OrderItem oi=new OrderItem(1,1000,new Orders("Abhiss"));

		Transaction tr=session.beginTransaction();
		
		session.save(oi);
		
		tr.commit();
		
		
		
		session.close();
		sf.close();
		
		
	}

}
