package gr.hua.dit.efoodClone.dao;

import java.util.List;

import gr.hua.dit.efoodClone.entity.restaurantOwners;

public interface restaurantOwnersDAO {
	
	public List<restaurantOwners> findAll();
	
	public void save(restaurantOwners restaurantOwner);
	
	public restaurantOwners findById(int id);
	

}
