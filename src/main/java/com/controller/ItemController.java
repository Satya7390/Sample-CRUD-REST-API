package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Item;
import com.service.ItemService;

@RestController
public class ItemController {

	@Autowired
	ItemService service;

	@PostMapping("/additem")
	public String addItem(@RequestBody Item item) {
		return service.addItem(item);
	}

	@GetMapping("/findbyid")
	public Item findById(@RequestParam int id) {
		return service.findById(id);
	}

	@GetMapping("/findall")
	public List<Item> findAllItems() {
		return service.findAllItems();
	}

	@DeleteMapping("deletebyid")
	public String deleteById(@RequestParam int id) {
		return service.deleteById(id);
	}

	@PutMapping("/update")
	public String updateItem(@RequestParam int id, @RequestBody Item newitem) {
		return service.updateItem(id, newitem);
	}

}
