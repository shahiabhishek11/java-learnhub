package A1;

public class Student {
 private int stdid;
 private String name,city;
 private double percentage;
public Student(int stdid, String name, String city, double d) {
	super();
	this.stdid = stdid;
	this.name = name;
	this.city = city;
	this.percentage = d;
}
public int getStdid() {
	return stdid;
}
public void setStdid(int stdid) {
	this.stdid = stdid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(float percentage) {
	this.percentage = percentage;
}
@Override
public String toString() {
	return "Student [stdid=" + stdid + ", name=" + name + ", city=" + city + ", percentage=" + percentage + "]";
}
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	int CityCode=0;
	
		if(this.city.equals("Mumbai"))
				{
					CityCode=10;
					
				}
		else if(this.city.equals("Pune"))
				{
					CityCode=20;
					
				}
		
		else if(this.city.equals("Delhi"))
		{
			CityCode=30;
			
		}
		else if(this.city.equals("Banglore"))
		{
			CityCode=40;
			
		}
		
		return CityCode;
}
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
}
 
 
 

 
 
 
}
