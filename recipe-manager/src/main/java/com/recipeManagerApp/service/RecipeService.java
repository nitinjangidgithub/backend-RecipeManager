package com.recipeManagerApp.service;

import java.util.List;

import com.recipeManagerApp.model.Recipe;

public interface RecipeService {

	public List<Recipe> getRecipes();
	public Recipe saveRecipe(Recipe recipe);
}
