package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="per_emp")
@PrimaryKeyJoinColumn(name="eid")
public class PermanentEmp extends Emp{

	@Column
	float salary;
	
	@Column
	float bonus;

	

	public PermanentEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	public PermanentEmp(String name,float salary, float bonus) {
		super(name);
		this.salary = salary;
		this.bonus = bonus;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "PermanentEmp [salary=" + salary + ", bonus=" + bonus + ", empid=" + empid + ", name=" + name + "]";
	}

	
	
}
