//package gr.hua.dit.efoodClone.controller;
/*package gr.hua.dit.springbootdemo.controller;

import gr.hua.dit.springbootdemo.dao.customerAddressDAO;
import gr.hua.dit.springbootdemo.entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/customerAddress")

public class customerAddressController {
	
	@Autowired
	private customerAddressDAO customeraddressDAO;
	
	@GetMapping("")
	List<customerAddress> getall(){
		return customeraddressDAO.findAll();
	}
	
	@PostMapping("")
	customerAddress save(@RequestBody customerAddress customeraddress) {
		customeraddress.setId(0);
		customeraddressDAO.save(customeraddress);
		return customeraddress;
	}
	
	@GetMapping("/{id}")
	customerAddress get(@PathVariable int id) {
		customerAddress customeraddress = customeraddressDAO.findById(id);
		return customeraddress;
	}
	
	
	

}*/
