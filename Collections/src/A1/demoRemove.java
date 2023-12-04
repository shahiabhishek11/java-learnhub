package A1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demoRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		List<String> lt=new ArrayList<>();
		
		int x=0;
		
		while(x!=-1)
		{
		System.out.println("\n------Menu------\n1)Add\n2)Remove\n3)display\n4)Exit\nEnter the choice ");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("Enter the String ");
			String str=sc.next();
			lt.add(str);
			break;
			
		
		case 2:
			System.out.println("\nEnter the index to remove ");
			int ind=sc.nextInt();
			lt.remove(ind);
			break;
			
		
		case 3:
			System.out.println("\n---------------Display------------\n");
			for(String s : lt)
			{
				System.out.println(s);
			}
			break;
				
		case 4:
				x=-1;
				break;
		
		}
		
		}	
		

	}

}
