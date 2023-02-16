package gr.hua.dit.efoodClone.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="restaurant")
public class restaurant implements Serializable{
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
	
	@Column(name = "restaurant_name")
	private String restaurantName;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="restaurant_address_id")
	private Address address ;
	
	@OneToMany(mappedBy="restaurant",
            cascade= {CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.DETACH, CascadeType.REFRESH})
    @JsonManagedReference
    private List<menu_item> menuItems;
    
  
    
    
    
    
    
	
	
	
	
	
	
	
	
	
	

}
