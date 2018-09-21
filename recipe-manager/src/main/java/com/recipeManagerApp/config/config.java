package com.recipeManagerApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.recipeManagerApp.service.RecipeService;
import com.recipeManagerApp.service.RecipeServiceImpl;

@Configuration
public class config {

	@Bean
	public RecipeService recipeService() {
		return new RecipeServiceImpl();
	}


}
