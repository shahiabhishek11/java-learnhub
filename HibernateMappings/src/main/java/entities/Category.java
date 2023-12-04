package entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int cid;
	
	@Column
	String cname;
	
	@Column
	String cdesc;

	
	@OneToMany(mappedBy = "catid",cascade = CascadeType.ALL )
	Set<Product> p;
	
	
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(String cname, String cdesc) {
		super();
		this.cname = cname;
		this.cdesc = cdesc;
	}
	
	

	public Set<Product> getP() {
		return p;
	}

	public void setP(Set<Product> p) {
		this.p = p;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCdesc() {
		return cdesc;
	}

	public void setCdesc(String cdesc) {
		this.cdesc = cdesc;
	}
	
	
	
	
}
