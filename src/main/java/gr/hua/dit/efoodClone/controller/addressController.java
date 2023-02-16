package gr.hua.dit.efoodClone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import gr.hua.dit.efoodClone.dao.AddressDAO;
import gr.hua.dit.efoodClone.dao.customerDAO;
import gr.hua.dit.efoodClone.entity.Address;
import gr.hua.dit.efoodClone.entity.customer;
import gr.hua.dit.efoodClone.entity.menu_item;
import gr.hua.dit.efoodClone.entity.restaurant;

import java.util.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/addresses")
public class addressController {
	
	@Autowired
	private AddressDAO addressDAO;
	
	@Autowired
	private customerDAO customerdao;
	
	@GetMapping("")
	List<Address> getall(){
		return addressDAO.findAll();
	}
	
	@PostMapping("")
	Address save(@RequestBody Address address) {
		address.setId(0);
		addressDAO.save(address);
		return address;
	}
	
	@GetMapping("/{id}")
	Address get(@PathVariable int id) {
		Address address = addressDAO.findById(id);
		return address;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		addressDAO.delete(id);

	}
	
	/*@PostMapping("/{id}/customer/{cid}")
	customer addcustomerAddress(@PathVariable int id , @PathVariable int cid) {
		customer Customer = customerdao.findById(cid);
		Address address = addressDAO.findById(id);
		
		if(address == null ) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "entity not found");
		}
		
		
		address.setCustomer(Customer);
		//customerdao.save(Customer);
		return Customer;
		
	}*/

}
