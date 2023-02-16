package gr.hua.dit.efoodClone.dao;

import java.util.List;

import gr.hua.dit.efoodClone.entity.Address;



public interface AddressDAO {
	
	public List<Address> findAll();
	
	public void save(Address address);
	
	public Address findById(int id);
	
	public void delete(int id);

}
