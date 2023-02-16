package gr.hua.dit.efoodClone.dao;

import java.util.List;

import gr.hua.dit.efoodClone.entity.menu_item;

public interface menu_ItemDAO {

	public List<menu_item> findAll();
	
	public void save (menu_item menu_item);
	
	public menu_item findById(int id);
	
	public void delete(int id);
	
	public List<menu_item> findByRestaurant(int resid);
	
}
