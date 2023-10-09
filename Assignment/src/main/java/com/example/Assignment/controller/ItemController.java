
package com.example.Assignment.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Assignment.entity.Items;
import com.example.Assignment.service.ItemServices;

@RestController
@Validated
public class ItemController
{
	@Autowired
	private ItemServices itemservice;
	
	// GET endpoint to retrieve all items
	@GetMapping("/Items")
	public List<Items> getAllItems()
	{
		return this.itemservice.getAllitems();
	}
	
	// GET endpoint to retrieve an item by its ID
	@GetMapping("/Items/{id}")
	public Items getItemByid(@PathVariable("id") int id)
	{
		return this.itemservice.getItemById(id);
		
	}

	// POST endpoint to add an item to the collection
	@PostMapping("/Items")
	public Items addItems(@RequestBody @Valid Items item)
	{
		// Call the service to add the item
		Items i = itemservice.addItems(item);
		return i;
	}
	
}

