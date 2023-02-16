package gr.hua.dit.efoodClone.service;

import java.util.List;

import gr.hua.dit.efoodClone.entity.restaurant;

public interface restaurantService {
	
	public List<restaurant> getRestaurants();
	
	public void saveRestaurant(restaurant restaurant);
	
	public restaurant findRestaurant(int id);
	
	 public void deleteRestaurant(int id);

}
