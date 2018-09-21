package com.recipeManagerApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recipeManagerApp.model.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long>{

}
