package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.entity.Item;

@Service
public class ItemService {

	List<Item> items = new ArrayList<>();

	// special case so that we have add item first time

	ItemService() {
		Item i = new Item(101, "Phone", 19999.99, "High Performance");
		items.add(i);
	}

	// Adding single Item logic
	public String addItem(Item item) {
		items.add(item);
		return "Items added successfully..!!";
	}

	// Find item by id
	public Item findById(int id) {
		for (Item i : items) {
			if (i.getId() == id) {
				return i;
			}
		}
		return null;
	}

	// find all items
	public List<Item> findAllItems() {
		return items;
	}

	// delete item by id
	public String deleteById(int id) {
		for (Item i : items) {
			if (i.getId() == id) {
				items.remove(i);
				return "Item Deleted Successfully..!!";
			}
		}
		return "Record not found for given id..!!";
	}

	// Update items details

	public String updateItem(int id, Item newitem) {

		Item existingitem = new Item();

		for (Item i : items) {

			if (i.getId() == id) {

				existingitem = i;
			}
		}

		if (existingitem.getId() == 0) {
			return "No record found for given id";
		}

		if (newitem.getName() == null && newitem.getPrice() == 0 && newitem.getDescription() == null) {

			return "No new data provided for the updatation..!!";
		}

		if (newitem.getName() != null) {
			existingitem.setName(newitem.getName());
		}

		if (newitem.getPrice() != 0) {
			existingitem.setPrice(newitem.getPrice());
		}

		if (newitem.getDescription() != null) {
			existingitem.setDescription(newitem.getDescription());
		}

		return "Item Record Updated successfully..!!";
	}

}
