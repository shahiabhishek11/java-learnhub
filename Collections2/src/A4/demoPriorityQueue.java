package A4;

import java.util.PriorityQueue;
import java.util.Queue;

public class demoPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String>q=new PriorityQueue<>();
		
			q.add("Mumbai");
			q.add("Delhi");
			q.add("Pune");
			q.add("Banglore");
			q.add("Indore");
			q.add("Kolkata");
			q.add("Chennai");
			q.add("Lucknow");
			
			System.out.println("\n----------Using ForEach Loop----------\n");
			
			for(String s:q)
			{
				System.out.println(s);
			}
			
			System.out.println("\n----------Using poll ----------\n");
			
			while(!q.isEmpty())
			{
				System.out.println(q.poll());
			}
			
			

	}

}
