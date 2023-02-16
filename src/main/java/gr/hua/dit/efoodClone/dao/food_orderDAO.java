package gr.hua.dit.efoodClone.dao;

import java.util.List;

import gr.hua.dit.efoodClone.entity.food_order;


public interface food_orderDAO {
	
	public List<food_order> findAll();
	
	public void save(food_order food_order);
	
	public food_order findById(int id);

}
