package A7;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class demoDateAndTime {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		Date d=Calendar.getInstance().getTime();
		System.out.println("\n\n-------------Menu------------");
		System.out.println("\n1)Current Date and Time ");
		System.out.println(d);
		
		System.out.println("\n\n2)Week Of Year From Current date");
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
		
		System.out.println("\n\n3)Display Time and Date in Format(03 DEC 2021 11:56:40 am)");
		SimpleDateFormat sd=new SimpleDateFormat("dd MMM yyyy hh:mm:ss a");
		System.out.println(sd.format(d));
		
		System.out.println("\n\n4)Add 3 years in Current date and display it in short format ");
		SimpleDateFormat sd1=new SimpleDateFormat("dd MMM yyyy");
		cal.add(Calendar.YEAR, 3);
		System.out.println(sd1.format(cal.getTime()));
		
		
		System.out.println("\n\n5)Extract year part of Current year and check whether leap year or not");
		SimpleDateFormat sd2=new SimpleDateFormat("yyyy");
		String y=sd2.format(d);
		int yy=Integer.parseInt(y);
		
		System.out.println(yy+" is current year ");
		if ( ((yy % 4 == 0) && (yy % 100!= 0)) || (yy%400 == 0))
		{
			System.out.println("Leap year ");
		}
		else {
			System.out.println(" Not Leap year ");
		}
	
		System.out.println("\n\n6)Accept the date from user as string and display in date format");
		System.out.println("Enter the date in dd/mm/yy format");
		String date=sc.next();
		Date d1=new SimpleDateFormat("dd/MM/yyyy").parse(date);
		System.out.println(d1);
		
		
	}

}
