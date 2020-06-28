package com.inventory.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.model.Item;

@RestController
public class InventoryController {

	@GetMapping("/item/{itemId}")
	public ResponseEntity<Item> getItem(@PathVariable("itemId") int itemId) {
		Item item = new Item();
		item.setItemId(itemId);
		item.setLocationId(2005000);
		item.setAvailable(50);
		return new ResponseEntity<Item>(item, HttpStatus.OK);
		
	}

}
