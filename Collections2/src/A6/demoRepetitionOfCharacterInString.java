package A6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class demoRepetitionOfCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String ");
		String str=sc.next();
		str=str.toLowerCase();
		
		Map<Character,Integer>ch=new HashMap<>();
		
		for(Character c:str.toCharArray())
		{
				if(ch.containsKey(c))
				{
					ch.put(c,ch.get(c)+1);
				}
				else {
					ch.put(c, 1);
				}
				
		}
		
		System.out.println(ch); 
		
		
		
		
		
		for(char i='a';i<='z';i++)
		{
			
			int cnt=0;
			
			for(int j=0;j<str.length();j++)
			{
				if(i==str.charAt(j))
				{
					cnt++;
				}
				
			}
				if(cnt!=0)
				{
					System.out.println(i+" repeated "+cnt+" times");
				}
	
		}
		

	}

}
