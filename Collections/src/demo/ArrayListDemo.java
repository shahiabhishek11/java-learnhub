package demo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		List list=new ArrayList();
		list.add("hello");
		list.add(8);
		list.add(Calendar.getInstance().getTime());
		
		
		System.out.println((Date)list.get(0));
		*/
		
		List<String>names=new ArrayList<>();
		names.add("object");
		names.add("hello");
		names.add("java");
		names.add("sun");
		
		names.add("Collections");
		System.out.println(names);
		
		names.add(2,"Welcome");
		System.out.println(names);
		
		names.remove(4);
		System.out.println(names);
		
		if(names.remove("Welcome"))
			System.out.println("Welcome is removed.");
		
			for( String s :names)
				System.out.println(s.toUpperCase());
			
			
		
			
		Iterator<String>itr=names.iterator();
		
		
			while(itr.hasNext())
			{
				System.out.println(((String)itr.next()).length());
				//System.out.println(itr.next());
			}
			
			while(itr.hasNext())
			{
				//System.out.println(((String)itr.next()).length());
				System.out.println(itr.next());
			}
			
			System.out.println("---------------------------");
			
		ListIterator<String> litr =names.listIterator();
		
			while(litr.hasNext())
				litr.next();
			//1 2 3 4 5 
			
				while(litr.hasPrevious())
					System.out.println(litr.previous());
				
				
				System.out.println("Size--->"+names.size());
				
		Collections.sort(names);
		
	
				
				
				System.out.println(Collections.binarySearch(names,"object"));
				
				
				if(names.contains("object"))
					System.out.println("Object Present ..");
		
	
	}

}
