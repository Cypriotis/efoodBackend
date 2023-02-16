package gr.hua.dit.efoodClone.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.io.Serializable;


@Entity
@Table(name="menu_item")
public class menu_item {
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(restaurant restaurant) {
		this.restaurant = restaurant;
	}
	public int getRID() {
		return rid;
	}

	public void setResID(int rid) {
		this.rid = rid;
	}
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

	@Column(name = "item_name")
	private String itemName;
	
	@Column(name = "item_description")
	private String itemDescription;
	
	@Column(name = "price")
	private float price;
	
	@Column(name = "rid")
	private int rid;
	
	@ManyToOne(cascade={
            CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH
    })
	@JoinColumn(name="restaurant_id")
	@JsonBackReference
	private restaurant restaurant;
	
	
	
	

}
