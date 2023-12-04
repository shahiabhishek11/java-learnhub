package demo;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map= new HashMap<>();
		
		map.put(10, "Rahul");
		map.put(11, "Amit");
		map.put(12, "R");
		map.put(13, "laul");
		map.put(14, "Rd");
		map.put(15, "KD");
		map.put(16, "AS");
		map.put(17, "dfg");
		map.put(18, "Rahul");
		map.put(19, "Rahul");
		map.put(21, "Rahul");
		map.put(19, "Rahul");
		map.put(21, "Lami");
		
		if(map.containsKey(21))
		{
			System.out.println(map.get(21));
		}
		
		
		Set<Map.Entry<Integer,String>>set=map.entrySet();
		
		for(Map.Entry<Integer, String> entry:set)
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		
		
		System.out.println("*********************");
		
		//Iterator<Entry<Integer,String>>itr=new 
		
		
		
		
		
		

	}

}
