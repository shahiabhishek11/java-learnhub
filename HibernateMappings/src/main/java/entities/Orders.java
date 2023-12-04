package entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int oid;
	
	@Column
	String cname;
	
	//name of property for fk column
	@OneToMany(mappedBy = "order",cascade=CascadeType.ALL)
	Set<OrderItem> items;
	
	public Set<OrderItem> getItems() {
		return items;
	}

	public void setItems(Set<OrderItem> items) {
		this.items = items;
	}

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(String cname) {
		super();
		this.cname = cname;
	}

	
	
	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", cname=" + cname + ", items=" + items + "]";
	}

	
	
	
}
