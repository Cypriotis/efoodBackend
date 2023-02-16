/*package gr.hua.dit.efoodClone.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.efoodClone.entity.restaurant;


@Repository
public class restaurantOwnersDAOImpl implements restaurantOwnersDAO {
	
	@Autowired
	private EntityManager entityManager;
	

	@Override
	@Transactional
	public List<restaurantOwners> findAll() {
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
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}*/
