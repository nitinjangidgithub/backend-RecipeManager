package com.recipeManagerApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "recipe" )
public class Recipe {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column(name="recipe_id")
	private Long id;

	@Column(name = "recipe_name")
	private String recipeName;

	@Column(name = "ingredient_1")
	private String ingredient1;

	@Column(name = "ingredient_2")
	private String ingredient2;

	@Column(name = "ingredient_3")
	private String ingredient3;

	@Column(name = "ingredient_4")
	private String ingredient4;

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(final String recipeName) {
		this.recipeName = recipeName;
	}

	public String getIngredient1() {
		return ingredient1;
	}

	public void setIngredient1(final String ingredient1) {
		this.ingredient1 = ingredient1;
	}

	public String getIngredient2() {
		return ingredient2;
	}

	public void setIngredient2(final String ingredient2) {
		this.ingredient2 = ingredient2;
	}

	public String getIngredient3() {
		return ingredient3;
	}

	public void setIngredient3(final String ingredient3) {
		this.ingredient3 = ingredient3;
	}

	public String getIngredient4() {
		return ingredient4;
	}

	public void setIngredient4(final String ingredient4) {
		this.ingredient4 = ingredient4;
	}

	@Override
	public String toString() {
		return "Recipe [id=" + id + ", recipeName=" + recipeName + ", ingredient1=" + ingredient1 + ", ingredient2=" + ingredient2 + ", ingredient3=" + ingredient3 + ", ingredient4=" + ingredient4 + "]";
	}



}
