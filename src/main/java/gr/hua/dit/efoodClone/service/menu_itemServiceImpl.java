package gr.hua.dit.efoodClone.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gr.hua.dit.efoodClone.dao.menu_ItemDAO;
import gr.hua.dit.efoodClone.entity.menu_item;


@Service
public class menu_itemServiceImpl implements menu_itemService {
	
	@Autowired
	private menu_ItemDAO menuitemDao;

	@Override
	@Transactional
	public List<menu_item> getItems() {
		return menuitemDao.findAll();
	}

	@Override
	@Transactional
	public void saveItem(menu_item menu_item) {
		menuitemDao.save(menu_item);
		
	}

	@Override
	@Transactional
	public menu_item findItem(int id) {
		return menuitemDao.findById(id);
	}

}
