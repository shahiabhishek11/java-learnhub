package apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



import entities.OrderItem;
import entities.Orders;

public class AssociationFetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		//read info from xml file
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
		
		//establish connection to database
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
		
		Session session=sf.openSession();
		OrderItem oi=session.get(OrderItem.class, 1);
		
		System.out.println("Qty:-"+oi.getQty()+" Price:-"+oi.getPrice());
		System.out.println("Order Id "+oi.getOrder().getCname());
		
		
		Orders o=session.get(Orders.class, 1);
		
		System.out.println("cname : "+o.getCname());
		
		
		for(OrderItem oitem:o.getItems())
		{
			System.out.println(oitem.getQty()+" : "+oitem.getPrice());;
		}
		
		
		
		
	}

}
