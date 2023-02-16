package gr.hua.dit.efoodClone.controller;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import gr.hua.dit.efoodClone.dao.menu_ItemDAO;
import gr.hua.dit.efoodClone.dao.restaurantDAO;
import gr.hua.dit.efoodClone.entity.menu_item;
import gr.hua.dit.efoodClone.entity.restaurant;
//import gr.hua.dit.efoodClone.service.restaurantService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/menuItems")
public class menuItemController {

		@Autowired
		private menu_ItemDAO menuItemDAO;
		
		@Autowired
		private restaurantDAO restaurantdao;
		
		@GetMapping("")
		List<menu_item> getall(){
			return menuItemDAO.findAll();
		}
		
		@PostMapping("")
		menu_item save(@RequestBody menu_item menu_item) {
			menu_item.setId(0);
			menuItemDAO.save(menu_item);
			return menu_item;
		}
		
		@GetMapping("/{id}")
		menu_item get(@PathVariable int id) {
			menu_item menu_item = menuItemDAO.findById(id);
			return menu_item;
		}
		
		@GetMapping("/restaurantMenu/{rid}")
		List<menu_item> getallByRest(@PathVariable int rid) {
			return  menuItemDAO.findByRestaurant(rid);
			
		}
		
		@DeleteMapping("/{id}")
		public void delete(@PathVariable int id) {
			menuItemDAO.delete(id);

		}
		
		
		@PostMapping("/{id}/restaurant/{rid}")
		restaurant addRestaurant(@PathVariable int id , @PathVariable int rid) {
			restaurant restaurant = restaurantdao.findById(rid);
			menu_item menu_Item = menuItemDAO.findById(id);
			
			if(menu_Item == null ) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND, "entity not found");
			}
			
			
			menu_Item.setRestaurant(restaurant);
			restaurantdao.save(restaurant);
			return restaurant;
			
		}
		
		
}
