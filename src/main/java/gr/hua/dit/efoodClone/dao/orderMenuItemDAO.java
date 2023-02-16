package gr.hua.dit.efoodClone.dao;


import java.util.List;

import gr.hua.dit.efoodClone.entity.orderMenuItem;


public interface orderMenuItemDAO {
	
	public List<orderMenuItem> findAll();
	
	public void save(orderMenuItem order_menu_item);
	
	public orderMenuItem findById(int id);
	
}
