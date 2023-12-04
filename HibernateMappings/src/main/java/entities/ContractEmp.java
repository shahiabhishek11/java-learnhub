package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="con_emp")
@PrimaryKeyJoinColumn(name="eid")
public class ContractEmp extends Emp {

	@Column
	float days;
	
	@Column
	float payperday;

	public ContractEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContractEmp(String name, float days, float payperday) {
		super(name);
		this.days = days;
		this.payperday = payperday;
	}

	public float getDays() {
		return days;
	}

	public void setDays(float days) {
		this.days = days;
	}

	public float getPayperday() {
		return payperday;
	}

	public void setPayperday(float payperday) {
		this.payperday = payperday;
	}

	@Override
	public String toString() {
		return "ContractEmp [days=" + days + ", payperday=" + payperday + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}

