package gr.hua.dit.efoodClone.entity;

import javax.persistence.*;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.io.Serializable;

import java.util.List;


@Entity
@Table(name="orderMenuItem")


public class orderMenuItem implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuanityOrdered() {
		return quanityOrdered;
	}

	public void setQuanityOrdered(String quanityOrdered) {
		this.quanityOrdered = quanityOrdered;
	}

	@Column(name = "quanity_ordered")
	private String quanityOrdered;
	
	 
	

}
