package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="emp")
@Inheritance(strategy=InheritanceType.JOINED)

public class Emp 
{
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	int empid;
	
	
	@Column
	String name;


	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Emp( String name) {
		super();
		
		this.name = name;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", name=" + name + "]";
	}
	
	
	
}
