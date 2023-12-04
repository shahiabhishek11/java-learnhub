package entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*
 *
 * 4. Create Product class with information pid(pk), name, price and catid(fk) with Category having information as cid(pk), cname, cdesc. Save and retrieve information about categories and products using association  mapping.
a. Save Category instance
b. Use this category for creating product and then save it
c. Create new  category with all the products and save it.
d. Create new product with new category and save it.
e. Fetch all the products with its category information
f. Fetch all the categories with its products
 * */

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int pid;
	
	@Column
	String name;
	
	@Column
	float price;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cid")
	Category catid;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Product(String name, float price, Category catid) {
		super();
		this.name = name;
		this.price = price;
		this.catid = catid;
	}



	public Product(int pid, String name, float price, Category catid) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.catid = catid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	

	public Category getCatid() {
		return catid;
	}

	public void setCatid(Category catid) {
		this.catid = catid;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + ", catid=" + catid + "]";
	}
	
	
	
	

}
