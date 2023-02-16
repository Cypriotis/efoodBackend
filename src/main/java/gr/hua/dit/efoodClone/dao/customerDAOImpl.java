package gr.hua.dit.efoodClone.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.efoodClone.entity.Address;
import gr.hua.dit.efoodClone.entity.customer;


@Repository
public class customerDAOImpl implements customerDAO {
	
	@Autowired
	private EntityManager entityManager;
	

	@Override
	@Transactional
	public List<customer> findAll() {
		Session session = entityManager.unwrap(Session.class);
		Query query = session.createQuery("from customer", customer.class);
		List<customer> customers = query.getResultList();
		return customers;
	}
	

	@Override
	@Transactional
	public void save(customer customer) {
		customer a_customer = entityManager.merge(customer);
	}

	@Override
	@Transactional
	public customer findById(int id) {
		return entityManager.find(customer.class, id);
				
	}
	
	@Override
	@Transactional
	public void delete(int id) {
		customer customer = entityManager.find(customer.class, id);
		entityManager.remove(customer);
	}
	
	@Override
	@Transactional
	public List<customer> findAuth(String id, String email) {
		Session session = entityManager.unwrap(Session.class);
		Query query = session.createQuery("from customer WHERE password="+ id + "AND email=" + email, customer.class);
		List<customer> auth_customer = query.getResultList();
		return auth_customer;
				
	}

}
