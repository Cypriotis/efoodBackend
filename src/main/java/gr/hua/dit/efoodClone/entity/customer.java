package gr.hua.dit.efoodClone.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="customer")

public class customer implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
	
	@Column(name = "first_name")
	private String firstName;


	@Column(name = "last_name")
	private String lastName;

	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="phone")
	private int phone;
	
	
	 /*@OneToMany(mappedBy="customer",
	            cascade= {CascadeType.PERSIST, CascadeType.MERGE,
	                    CascadeType.DETACH, CascadeType.REFRESH})
	    @JsonManagedReference
	    private List<restaurantOwners> restOwners;*/
	    
	//@OneToOne(mappedBy="customer", cascade=CascadeType.ALL)
	// private customerAddress custAddress;
	 
	 @OneToOne(mappedBy="customer", cascade=CascadeType.ALL)
	 private food_order food_order;
	 
	 public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customer_address_id")
	private Address address ;
	 
	 
	 
	
	
	public customer() {
		
	}
	
	public customer(String firstName, String lastName, String email,String password, int phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Customer = " + firstName + " " + lastName;
	}
	
	public food_order getFood_order() {
		return food_order;
	}

	public void setFood_order(food_order food_order) {
		this.food_order = food_order;
	}

	/*@OneToOne(mappedBy="address",
            cascade= {CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.DETACH, CascadeType.REFRESH})
    @JsonManagedReference
    private Address address;*/
	
	
}
