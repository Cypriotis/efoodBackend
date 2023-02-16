package gr.hua.dit.efoodClone.dao;

import java.util.List;



import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.efoodClone.entity.customer;
import gr.hua.dit.efoodClone.entity.menu_item;

@Repository
public class menu_ItemDAOImpl implements menu_ItemDAO{
	
	@Autowired
	private EntityManager entityManager;
	
	@Autowired
	private restaurantDAO resDAO;

	@Override
	@Transactional
	public List<menu_item> findAll() {
		 Session session = entityManager.unwrap(Session.class);
	     Query query = session.createQuery("from menu_item", menu_item.class);
	     List<menu_item> menu_items = query.getResultList();
	     return menu_items;
	}

	@Override
	@Transactional
	public void save(menu_item menu_item) {
		menu_item a_manu_item = entityManager.merge(menu_item);
		
	}

	@Override
	@Transactional
	public menu_item findById(int id) {
		return entityManager.find(menu_item.class, id);
	}
	

	@Transactional
	public void delete(int id) {
		menu_item menu_item = entityManager.find(menu_item.class, id);
		entityManager.remove(menu_item);
	}

	
	@Transactional
	public List<menu_item> findByRestaurant(int rid) {
		Session session = entityManager.unwrap(Session.class);
		Query query = session.createQuery("select b from menu_item b where b.rid = :status", menu_item.class).setParameter("status", rid);
		List<menu_item> menu_items = query.getResultList();
		return menu_items;
	}
	

}
