package gr.hua.dit.efoodClone.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name="address")
public class Address implements Serializable {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

	@Column(name = "steet_number")
	private int streetNumber;
	
	@Column(name = "address_line")
	private int addressLine;

	@Column(name = "city")
	private String city;
	
	@Column(name = "region")
	private String region;
	
	@Column(name = "postal_code")
	private int postalCode;
	
	public Address() {
		
	}
	
	public Address(int streetNumber , int addressLine, String city, String region, int postalCode) {
		this.streetNumber = streetNumber;
		this.addressLine = addressLine;
		this.city = city;
		this.region = region;
		this.postalCode = postalCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public int getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(int addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	
/*	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customer_id")
	private customer customer;*/
	
	/*@OneToOne(cascade={
            CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH
    })
	@JoinColumn(name="customer_id")
	@JsonBackReference
	private customer customer;
	*/
	@Override
	public String toString() {
		return "Address = "+ addressLine + postalCode;
	}

	
	
	
	
	
	
	

}
