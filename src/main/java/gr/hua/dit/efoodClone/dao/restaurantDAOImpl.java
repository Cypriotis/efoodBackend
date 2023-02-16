package gr.hua.dit.efoodClone.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import gr.hua.dit.efoodClone.entity.Address;
import gr.hua.dit.efoodClone.entity.restaurant;

import org.hibernate.Session;


@Repository

public class restaurantDAOImpl implements restaurantDAO{
	
	 @Autowired
	 private EntityManager entityManager;

	@Override
	@Transactional
	public List<restaurant> findAll() {
		Session session = entityManager.unwrap(Session.class);
		Query query = session.createQuery("from restaurant", restaurant.class);
	    List<restaurant> restaurants = query.getResultList();
	    return restaurants;

		
	}

	@Override
	@Transactional
	public void save(restaurant restaurant) {
		restaurant a_restaurant = entityManager.merge(restaurant);
		
	}

	@Override
	@Transactional
	public restaurant findById(int id) {
		return entityManager.find(restaurant.class, id);
	}
	
	@Override
	@Transactional
	public void delete(int id) {
		restaurant restaurant = entityManager.find(restaurant.class, id);
		entityManager.remove(restaurant);
	}

}
