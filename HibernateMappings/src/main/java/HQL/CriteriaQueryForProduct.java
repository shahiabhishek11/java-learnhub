package HQL;
/*
 * 
 * 
5. Create criteria query for following
a. Select all products
b. Select information about a product using productid
c. Select only prduct name and price from products
d. select count of all products
 * */



import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;


import entities.Product;

public class CriteriaQueryForProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();		
		//read info from xml file
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();				
		//establish connection to database
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
				
		Session session = sf.openSession();		
	/*	CriteriaBuilder builder=session.getCriteriaBuilder();
		CriteriaQuery<Product>cq= builder.createQuery(Product.class);		
		Root<Product>root=cq.from(Product.class);		
		cq.select(root);		
		Query<Product> q=session.createQuery(cq);
		
		List<Product> p1=q.getResultList();
		//Select all products
		for(Product e:p1)
		{
			System.out.println(e.getPid()+" "+e.getName()+" : "+e.getPrice()+" : "+e.getCatid().getCname());
		}
		
		//-------------------------------------------------------------------------------------------
		
		CriteriaBuilder builder=session.getCriteriaBuilder();
		CriteriaQuery<Object[]>cq= builder.createQuery(Object[].class);		
		Root<Product>root=cq.from(Product.class);		
		cq.multiselect(root.get("name"),root.get("price"));	
		
		Query<Object[]> q=session.createQuery(cq);
		
		List<Object[]> p1=q.getResultList();
		
		
		//Select only prduct name and price from products
		for(Object[] e:p1)
		{
			System.out.println(e[0]+":"+e[1]);
		}
		
		
		//---------------------------------------------------------------------------------------------------
		
		//Select information about a product using productid
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		CriteriaQuery<Object[]>cq= builder.createQuery(Object[].class);
			
		Root<Product>root=cq.from(Product.class);
			
		cq.multiselect(root.get("name"),root.get("price")).where(builder.equal(root.get("pid"),1));
		Query<Object[]> q=session.createQuery(cq);
		List<Object[]> emps=q.getResultList();
		
		for(Object[] e:emps)
		{
			System.out.println(e[0]+":"+e[1]);
		}
		
		*/
		
		//---------------------------------------------------------------------------------------------------
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Long>cq= builder.createQuery(Long.class);
			
		Root<Product>root=cq.from(Product.class);
			
		cq.select(builder.count(root));
		Query<Long> q=session.createQuery(cq);
		Long count=q.getSingleResult();
		
		
		System.out.println("count :-"+count);
	}

}
