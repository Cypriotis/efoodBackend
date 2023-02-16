package gr.hua.dit.efoodClone.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.efoodClone.entity.food_order;

@Repository
public class food_orderDAOImpl implements food_orderDAO{
	
	@Autowired
	private EntityManager entityManager;

	@Override
	@Transactional
	public List<food_order> findAll() {
		Session session = entityManager.unwrap(Session.class);
        Query query = session.createQuery("from food_order", food_order.class);
        List<food_order> food_orders = query.getResultList();
        return food_orders;
	}

	@Override
	@Transactional
	public void save(food_order food_order) {
		food_order food_order_id = entityManager.merge(food_order);
		
	}

	@Override
	@Transactional
	public food_order findById(int id) {
		return entityManager.find(food_order.class, id);
	}

	
}
