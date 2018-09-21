package com.recipeManagerApp.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.recipeManagerApp.model.Recipe;
import com.recipeManagerApp.service.RecipeService;



@RestController
public class RecipeController {

	@Autowired
	private RecipeService recipeService;

	@RequestMapping(value = "/recipes", method = RequestMethod.GET)
	@CrossOrigin
	public ResponseEntity<List<Recipe>> getRecipes() {
		return new ResponseEntity<>(recipeService.getRecipes(), new HttpHeaders(), HttpStatus.OK);
	}


	@RequestMapping( value = "/recipes", method = RequestMethod.POST)
	@CrossOrigin
	public ResponseEntity<Recipe> saveCustomer(@RequestBody final Recipe recipe) {
		final Recipe savedCustomer = recipeService.saveRecipe(recipe);
		final URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedCustomer.getId()).toUri();
		final HttpHeaders headers = new HttpHeaders();
		headers.setLocation(location);
		return new ResponseEntity<>(savedCustomer, headers, HttpStatus.CREATED);
	}


}
