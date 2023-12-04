package A1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class demoStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Student> ls=new HashSet<>();
		
		ls.add(new Student(1,"Ravi","Mumbai",88.99));
		ls.add(new Student(1,"Ravi","Pune",88.99));
		ls.add(new Student(1,"Ravi","Delhi",88.99));
		ls.add(new Student(1,"Ravi","Pune",88.99));
		ls.add(new Student(1,"Ravi","Delhi",88.99));
		ls.add(new Student(1,"Ravi","Pune",88.99));
		
		for(Student s:ls)
		System.out.println(s);
		

	}

}
