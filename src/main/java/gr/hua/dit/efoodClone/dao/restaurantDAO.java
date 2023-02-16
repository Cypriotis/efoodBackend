package gr.hua.dit.efoodClone.dao;

import java.util.List;

import gr.hua.dit.efoodClone.entity.restaurant;

public interface restaurantDAO {
	
	public List<restaurant> findAll();
	
	public void save(restaurant restaurant);
	
	public restaurant findById(int id);
	
	public void delete(int id);

}
