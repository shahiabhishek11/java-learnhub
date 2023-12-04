package demo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class demoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	//	ListIterator<String> ltr= names.listIterator();
		
		
		
		//Set<Integer> numbers=new HashSet<>();
		Set<Integer> numbers=new LinkedHashSet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(4);
		numbers.add(3);
		numbers.add(12);
		numbers.add(16);
		
		//add method is not present for specific index
		numbers.remove(5);
		
		for(Integer n : numbers)
			System.out.println(n);

	}

}
