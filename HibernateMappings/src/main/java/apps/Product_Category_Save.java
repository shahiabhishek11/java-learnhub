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

import entities.Category;
import entities.Product;

public class Product_Category_Save {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		//read info from xml file
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();				
				//establish connection to database
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
				
		Session session=sf.openSession();
		
		
		//Saving by using Category
		

		Category c=new Category("Electronic","Battery");
		Set<Product>item=new HashSet();
		item.add(new Product("Samsung",7000.56f,c));
		item.add(new Product("Vivo",4500.56f,c));
		c.setP(item);
		Transaction t=session.beginTransaction();		
		session.save(c);
		//session.saveOrUpdate(t);;
		t.commit();
		
		
		
		//Saving by product
		/*
		Product p=new Product(3,"OnePlus",6700f,new Category("Telephone","Mobiles"));
		Transaction t1=session.beginTransaction();
		session.save(p);
		t1.commit();*/
		
		session.close();
		sf.close();
	}

}
