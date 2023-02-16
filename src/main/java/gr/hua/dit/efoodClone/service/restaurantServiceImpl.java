package gr.hua.dit.efoodClone.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import gr.hua.dit.efoodClone.dao.restaurantDAO;
import gr.hua.dit.efoodClone.entity.restaurant;

@Service
@Primary
public class restaurantServiceImpl implements restaurantService{
	
	@Autowired
	private restaurantDAO restaurantdao;

	@Override
	@Transactional
	public List<restaurant> getRestaurants() {
		return restaurantdao.findAll();
	}

	@Override
	@Transactional
	public void saveRestaurant(restaurant restaurant) {
		restaurantdao.save(restaurant);
		
	}

	@Override
	@Transactional
	public restaurant findRestaurant(int id) {
		return restaurantdao.findById(id);
	}
	
	@Override
	@Transactional
    public void deleteRestaurant(int id) {
        restaurantdao.delete(id);
    }



}
