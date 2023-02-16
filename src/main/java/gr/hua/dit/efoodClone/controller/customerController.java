package gr.hua.dit.efoodClone.controller;

import gr.hua.dit.efoodClone.dao.AddressDAO;

import gr.hua.dit.efoodClone.dao.customerDAO;
import gr.hua.dit.efoodClone.entity.Address;
import gr.hua.dit.efoodClone.entity.customer;
import gr.hua.dit.efoodClone.entity.restaurant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/customers")
public class customerController {
	
	@Autowired
	private customerDAO customerDAO;
	
	@Autowired
	private AddressDAO addressdao;
	
	@Secured("ROLE_ADMIN")
	@GetMapping("")
	List<customer> getall(){
		return customerDAO.findAll();
	}
	
	@PostMapping("")
	customer save(@RequestBody customer customer) {
		customer.setId(0);
		customerDAO.save(customer);
		return customer;
	}
	
	@GetMapping("/{id}")
	customer get(@PathVariable int id) {
		customer customer = customerDAO.findById(id);
		return customer;
	}
	
	@PostMapping("/{id}/address/{Aid}")
	Address addcustomerAddress(@PathVariable int id , @PathVariable int Aid) {
		Address address = addressdao.findById(Aid);
		customer customer = customerDAO.findById(id);
		
		if(address == null ) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "entity not found");
		}
		
		customer.setAddress(address);
		addressdao.save(address);
		return address;
		
	}
	

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		customerDAO.delete(id);

	}
	
	@GetMapping("/auth/{pass}/{email}")
	List<customer> getAuth(@PathVariable String pass, String email){
		return customerDAO.findAuth(pass, email);
	}
	

}
