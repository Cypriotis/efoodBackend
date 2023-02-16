package gr.hua.dit.efoodClone.dao;

import java.util.List;

import gr.hua.dit.efoodClone.entity.customer;

public interface customerDAO {
	
	public List<customer> findAll();
	
	public void save(customer customer);
	
	public customer findById(int id);
	
	public void delete(int id);
	
	public List<customer> findAuth(String password, String Email);
	

	

}
