package com.app.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cuisine")
public class Cuisine {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int cuisineId;
	@Column(unique = true)
	private String name;
	private String image;
	@OneToMany(mappedBy = "cuisine")
	private List<FoodItem> foodItemList;
	
	public Cuisine() {
		
	}

	public Cuisine(int cuisineId, String name, String image) {
		super();
		this.cuisineId = cuisineId;
		this.name = name;
		this.image = image;
	}
	
	public Cuisine (int cuisineId) {
		this.cuisineId = cuisineId;
		
	}

	public int getCuisineId() {
		return cuisineId;
	}

	public void setCuisineId(int cuisineId) {
		this.cuisineId = cuisineId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<FoodItem> getFoodItemList() {
		return foodItemList;
	}

	public void setFoodItemList(List<FoodItem> foodItemList) {
		this.foodItemList = foodItemList;
	}

	@Override
	public String toString() {
		return "Cuisine [cuisineId=" + cuisineId + ", name=" + name + ", image=" + image + "]";
	}
	
	
	

	
	
	
	
}
