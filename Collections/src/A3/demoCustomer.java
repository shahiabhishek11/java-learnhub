package A3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class demoCustomer {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\Files\\Harsha.txt"));
		int x=0;
				
			while(x<3)
			{
				System.out.println("Enter 1 for new and 2 for registered Customer ");
				int ch=sc.nextInt();
				System.out.println("\nEnter name :- ");
				String name=sc.next();
				
				System.out.println("\nEnter email :- ");
				String email=sc.next();
				
				System.out.println("\nEnter number :- ");
				int number=sc.nextInt();
				
					if(ch==1)
					{
						x++;
						Customer c=new Customer(name,number,email);
						oos.writeObject(c);
					}
					else if(ch==2)
					{
						x++;
						System.out.println("Enter RegisterNumber :- ");
						int r=sc.nextInt();
						
						RegCustomer r1=new RegCustomer(name,number,email,r);
						oos.writeObject(r1);
					}
					
					else {
						System.out.println("\nPlz Enter Right Choice ");
					}
			}
			
			oos.close();
			
			
			
			
		
		
		
		

	}

}
