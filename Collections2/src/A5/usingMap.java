package A5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class usingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String>m=new HashMap<>();
		
		m.put(11,"Rahul");
		m.put(9,"Raama");
		m.put(6,"Krishna");
		m.put(13,"Urmila");
		m.put(14,"Abhishek");
		m.put(12,"Manish");
		m.put(123,"Nabin");
		m.put(44,"Babita");
		m.put(32,"Laxmi");
		
		
		Set<Map.Entry<Integer,String>> s=m.entrySet();
		
		
		for(Map.Entry<Integer, String> e:s)
		{
			System.out.println(e.getKey()+":"+e.getValue());
		}
		

	}

}
