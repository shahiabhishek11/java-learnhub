package apps;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Category;
import entities.Product;

public class Product_Category_FetchAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		//read info from xml file
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
		
		//establish connection to database
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
		Session session=sf.openSession();
		Query q=session.createQuery("from Category");
		Query q2=session.createQuery("from Product");
		
		List<Category>c=q.getResultList();
		System.out.println("-----------------Category Table-------------");
		for(Category c1:c)
		{
			System.out.println(c1.getCname()+":"+c1.getCid()+":"+c1.getP().size());
		}
		
		List<Product>p=q2.getResultList();
		
		System.out.println("-----------------Product Table-------------");
		for(Product p1:p)
		{
			System.out.println(p1.getName()+": "+p1.getCatid().getCname());
		}
		
	}

}
