package gr.hua.dit.efoodClone.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import gr.hua.dit.efoodClone.dao.customerAddressDAO;
import gr.hua.dit.efoodClone.entity.customerAddress;

public class customerAddressDAOImpl implements customerAddressDAO{
	
	@Autowired
	private EntityManager entityManager;
	
	

	@Override
	@Transactional
	public List<customerAddress> findAll() {
		Session session = entityManager.unwrap(Session.class);
        Query query = session.createQuery("from customerAddress", customerAddress.class);
        List<customerAddress> customerAddress = query.getResultList();
        return customerAddress;
	}

	@Override
	@Transactional
	public void save(customerAddress customerAddress) {
		customerAddress a_customerAddress = entityManager.merge(customerAddress);
	}

	@Override
	@Transactional
	public customerAddress findById(int id) {
		return entityManager.find(customerAddress.class, id);
	}

}
