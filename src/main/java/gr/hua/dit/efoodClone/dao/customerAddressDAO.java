package gr.hua.dit.efoodClone.dao;


import java.util.List;

import gr.hua.dit.efoodClone.entity.customerAddress;

public interface customerAddressDAO {
		
	public List<customerAddress> findAll();
	
	public void save(customerAddress customeraddress);
	
	public customerAddress findById(int id);
	
	
}
