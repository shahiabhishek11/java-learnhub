package apps;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.OrderItem;
import entities.Orders;

public class AssociationFetchAll {

	public static void main(String[] args) {
	
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		//read info from xml file
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
		
		//establish connection to database
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
		Session session=sf.openSession();
		Query q=session.createQuery("from Orders");
		
		/*
		List <Orders> orders=q.getResultList();
		
		for(Orders o: orders)
		{
			System.out.println(o.getOid()+":"+o.getCname()+":"+o.getItems().size());;
		}
	
	*/
		
		List <OrderItem> orders=q.getResultList();
		
		for(OrderItem o: orders)
		{
			System.out.println(o.getQty()+":"+o.getPrice()+":"+o.getOiid());
		}
	
	}

}
