package com.inventory.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {

	@RequestMapping("/Test")
	public String home() {
		return "Test";
	}

}
