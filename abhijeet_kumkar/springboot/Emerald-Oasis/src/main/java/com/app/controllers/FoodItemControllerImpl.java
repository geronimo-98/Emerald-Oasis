package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.config.Response;
import com.app.dtos.FoodItemDTO;
import com.app.services.FoodItemServiceImpl;

@CrossOrigin(origins = "*")
@RestController
public class FoodItemControllerImpl {
	@Autowired
	private FoodItemServiceImpl foodItem;
	
	
	@GetMapping("/fooditem/{id}")
	public ResponseEntity<?> findFoodItemsByCuisineId(@PathVariable("id") int cuisineId) {
		List<FoodItemDTO> result = foodItem.findFoodItemByCuisineId(cuisineId);
		return Response.success(result);
	}
}
