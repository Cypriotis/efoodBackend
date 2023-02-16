package gr.hua.dit.efoodClone.entity;

import javax.persistence.*;

import java.io.Serializable;


@Entity
@Table(name="customerAddress")
public class customerAddress implements Serializable {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cusomer_id")
	private customer customer;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public customer getCustomer() {
		return customer;
	}

	public void setCustomer(customer customer) {
		this.customer = customer;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
