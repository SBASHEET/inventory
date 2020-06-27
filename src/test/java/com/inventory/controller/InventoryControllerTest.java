package com.inventory.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class InventoryControllerTest {
	
	@Test
	public void shouldReturnTest() {
		InventoryController controller = new InventoryController();
		String response = controller.home();
		assertEquals("Test", response);
	}

}
