package gr.hua.dit.efoodClone.entity;

import javax.persistence.*;


import com.fasterxml.jackson.annotation.JsonBackReference;

import java.io.Serializable;
import java.util.List;



@Entity
@Table(name = "restaurantOwners")
public class restaurantOwners implements Serializable{
	
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


	

	
    
    
    
	
	
	
	

}
