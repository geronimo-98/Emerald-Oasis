package com.app.dtos;

import org.springframework.stereotype.Component;

import com.app.entities.Cuisine;
import com.app.entities.FoodItem;

@Component
public class DTOEntityConverter {
	public FoodItemDTO toFoodItemDTO(FoodItem entity) {
		if(entity == null)
			return null;
		FoodItemDTO dto = new FoodItemDTO();
		dto.setCuisineId(entity.getCuisine().getCuisineId());
		dto.setFoodItemId(entity.getFoodItemId());
		dto.setImage(entity.getImage());
		dto.setName(entity.getName());
		dto.setPrice(entity.getPrice());
		dto.setQuantity(entity.getQuantity());
		return dto;
	}
	
	public FoodItem toFoodItemEntity(FoodItemDTO dto) {
		if(dto == null)
			return null;
		FoodItem entity = new FoodItem();
		entity.setCuisine(new Cuisine(dto.getCuisineId()));
		entity.setFoodItemId(dto.getFoodItemId());
		entity.setImage(dto.getImage());
		entity.setName(dto.getName());
		entity.setPrice(dto.getPrice());
		entity.setQuantity(dto.getQuantity());
		return entity;
	}
}
