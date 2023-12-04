package entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="order_items")
public class OrderItem {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	int oiid;
	
	@Column
	int qty;
	
	@Column
	float price;
	
	//special column -fk 
	//typpe of the property is master entity
	//primary key of order -saved/fetched from this property
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_order")
	Orders order;

	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderItem(int qty, float price, Orders order) {
		super();
		this.qty = qty;
		this.price = price;
		this.order = order;
	}

	public int getOiid() {
		return oiid;
	}

	public void setOiid(int oiid) {
		this.oiid = oiid;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "OrderItem [oiid=" + oiid + ", qty=" + qty + ", price=" + price + ", order=" + order + "]";
	}
	
	
}
