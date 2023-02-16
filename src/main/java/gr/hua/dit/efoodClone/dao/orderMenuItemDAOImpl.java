package gr.hua.dit.efoodClone.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.efoodClone.entity.orderMenuItem;


@Repository
public class orderMenuItemDAOImpl implements orderMenuItemDAO{
	
	@Autowired
	private EntityManager entityManager;
	

	@Override
	@Transactional
	public List<orderMenuItem> findAll() {
		 Session session = entityManager.unwrap(Session.class);
	        Query query = session.createQuery("from orderMenuItem", orderMenuItem.class);
	        List<orderMenuItem> orderMenuItems = query.getResultList();
	        return orderMenuItems;
	}

	@Override
	@Transactional
	public void save(orderMenuItem order_menu_item) {
		orderMenuItem an_orderMenuItem = entityManager.merge(order_menu_item);
		
	}

	@Override
	@Transactional
	public orderMenuItem findById(int id) {
		return entityManager.find(orderMenuItem.class, id);
	}

}
