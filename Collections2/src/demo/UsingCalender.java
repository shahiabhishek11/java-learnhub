package demo;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class UsingCalender {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Date d=Calendar.getInstance().getTime();
		
		System.out.println(d);
		
		DateFormat df=DateFormat.getDateInstance(DateFormat.SHORT);
		
		System.out.println(df.format(d));
		
		SimpleDateFormat sd=new SimpleDateFormat("dd-mm-yyyy");
		//System.out.println(sd.format(d));
		
		Date parsedate=sd.parse("09-05-1234");
		System.out.println(parsedate);
		
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd");
		String date=sdf.format(d);
		
		int dd=Integer.parseInt(date);
		
		if(dd%2==0)
			System.out.println("Even date ");
		else
			System.out.println("odd date");
		
		
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.DATE,15);
		
		System.out.println(cal.getTime());
		
		
		
		cal.add(Calendar.MONTH, 3);
		System.out.println(cal.getTime());
		
		
		
		
		
		
	}

}
