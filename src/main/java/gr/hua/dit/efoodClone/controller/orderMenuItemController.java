package gr.hua.dit.efoodClone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gr.hua.dit.efoodClone.dao.orderMenuItemDAO;
import gr.hua.dit.efoodClone.entity.orderMenuItem;

@RestController
@RequestMapping("/orderMenuItems")

public class orderMenuItemController {
	
	@Autowired
	private orderMenuItemDAO orderMenuItemDAO;
	
	@GetMapping("")
	List<orderMenuItem> getall(){
		return orderMenuItemDAO.findAll();
	}
	
	@PostMapping("")
	orderMenuItem save(@RequestBody orderMenuItem orderMenuItem) {
		orderMenuItem.setId(0);
		orderMenuItemDAO.save(orderMenuItem);
		return orderMenuItem;
	}
	
	@GetMapping("/{id}")
	orderMenuItem get(@PathVariable int id) {
		orderMenuItem orderMenuItem = orderMenuItemDAO.findById(id);
		return orderMenuItem;
	}
	

}
