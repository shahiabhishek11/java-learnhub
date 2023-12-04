package demo;

import java.util.PriorityQueue;
import java.util.Queue;

public class UsingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String>que=new PriorityQueue<>();
		
		que.add("Welcome");
		que.add("Come");
		que.add("To");
		que.add("My");
		que.add("Home");
		que.add("For");
		que.add("Dinner");
		
		
		for(String s:que)
			System.out.println(s);
		
		System.out.println("************");
		
		while(!que.isEmpty())
		{
			//poll remove 
			System.out.println(que.poll());
		}
		
		
System.out.println("************");
		
		//while(!que.isEmpty())
		{
			//poll remove 
			System.out.println(que);
		}
		
	}

}
