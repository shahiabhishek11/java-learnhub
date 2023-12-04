package A2;

import java.util.Set;
import java.util.TreeSet;

public class demoEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Employee> e=new TreeSet<>();
		
		e.add(new Employee(1,"Rajiv",50000));
		e.add(new Employee(2,"Harsha",5000));
		e.add(new Employee(3,"Nabin",34000));
		e.add(new Employee(4,"Gorakh",65000));
		e.add(new Employee(5,"Abhishek",46000));
		
		for(Employee e1:e)
			System.out.println(e1);
		
		
		

	}

}
