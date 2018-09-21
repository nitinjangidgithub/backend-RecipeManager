package com.recipeManagerApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.recipeManagerApp.model.Recipe;
import com.recipeManagerApp.repository.RecipeRepository;

public class RecipeServiceImpl implements RecipeService{

	@Autowired
	private RecipeRepository recipeRepository;

	@Override
	public Recipe saveRecipe(final Recipe recipe) {
		return recipeRepository.save(recipe);
	}

	@Override
	public List<Recipe> getRecipes() {
		return recipeRepository.findAll();
	}


}
