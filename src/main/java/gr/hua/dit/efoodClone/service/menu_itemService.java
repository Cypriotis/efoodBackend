package gr.hua.dit.efoodClone.service;

import java.util.List;

import gr.hua.dit.efoodClone.entity.menu_item;

public interface menu_itemService {
	
	public List<menu_item> getItems();
	
	public void saveItem (menu_item menu_item);
	
	public menu_item findItem(int id);

}
