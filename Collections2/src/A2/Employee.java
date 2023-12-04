package A2;

public class Employee implements Comparable<Employee>{
	
	private int empid;
	private String ename;
	private double salary;
	public Employee(int empid, String ename, double salary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
			int sal= (int) (this.salary-o.salary);;
			
			if(sal==0)
				sal=(int)(this.empid-o.empid);
			
			return sal;
	}
	
	

}
