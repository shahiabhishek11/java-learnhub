package A3;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import A2.Employee;

public class demoComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Employee>e=new TreeSet<>(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return (int)(o1.getSalary()-o2.getSalary());
			}
			
		});
		
		
		
		
		e.add(new Employee(1,"Rajiv",50000));
		e.add(new Employee(2,"Harsha",5000));
		e.add(new Employee(3,"Nabin",34000));
		e.add(new Employee(4,"Gorakh",65000));
		e.add(new Employee(5,"Abhishek",46000));
		
		for(Employee e1:e)
			System.out.println(e1);
		
		

	}

}
