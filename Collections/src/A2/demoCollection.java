package A2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class demoCollection {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<String> lt=new ArrayList<>();
		
		int x=0;
		
		while(x!=-1)
		{
		System.out.println("\n\n------Menu------\n1)Add\n2)Reverse Display \n3)Sort \n4)Exit\nEnter the choice ");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("Enter the String ");
			String str=sc.next();
			if(lt.contains(str))
			{
				System.out.println(str + " is already present at index "+ lt.indexOf(str));
			}
			else 
			{
			lt.add(str);
			}
			break;
			
		
		case 2:
			System.out.println("\n--------------- Original Order ------------\n");
			for(String s : lt)
			{
				System.out.println(s);
			}
			System.out.println("\n--------------- Reverse Order ------------\n");
			Collections.reverse(lt);
			for(String s : lt)
			{
				System.out.println(s);
			}
			
			break;
			
		
		case 3:
			Collections.sort(lt);
			System.out.println("-------------Sorting in Ascending Order-----------");
			for(String s : lt)
			{
				System.out.println(s);
			}
			
			Collections.sort(lt,Collections.reverseOrder());
			System.out.println("-------------Sorting in Descending Order-----------");
			for(String s : lt)
			{
				System.out.println(s);
			}
			
			
			
			break;
				
		case 4:
				System.out.println("Exit");
				x=-1;
				break;
		
		}
		
		}	
		

	}

}
