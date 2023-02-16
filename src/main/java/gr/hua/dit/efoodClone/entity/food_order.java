package gr.hua.dit.efoodClone.entity;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.io.Serializable;


@Entity
@Table(name="food_order")
public class food_order implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

	@Column(name="order_datetime")
	private int dateTime;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDateTime() {
		return dateTime;
	}

	public void setDateTime(int dateTime) {
		this.dateTime = dateTime;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	public restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public customerAddress getCustomerAdress() {
		return customerAdress;
	}

	public void setCustomerAdress(customerAddress customerAdress) {
		this.customerAdress = customerAdress;
	}
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customer_id")
	private customer customer;

	@Column(name="total_amount")
	private float totalAmount;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="restaurant_id")
	private restaurant restaurant;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customer_address_id")
	private customerAddress customerAdress;
	
}
