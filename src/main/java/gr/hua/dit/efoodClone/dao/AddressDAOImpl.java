package gr.hua.dit.efoodClone.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.efoodClone.entity.Address;



@Repository
public class AddressDAOImpl implements AddressDAO{
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Address> findAll() {
		Session session = entityManager.unwrap(Session.class);
        Query query = session.createQuery("from Address", Address.class);
        List<Address> address = query.getResultList();
        return address;
	}

	@Override
	@Transactional
	public void save(Address address) {
		Address an_address = entityManager.merge(address);
		
	}

	@Override
	@Transactional
	public Address findById(int id) {
			return entityManager.find(Address.class, id);
	}
	
	@Override
	@Transactional
	public void delete(int id) {
		Address address = entityManager.find(Address.class, id);
		entityManager.remove(address);
	}

}
