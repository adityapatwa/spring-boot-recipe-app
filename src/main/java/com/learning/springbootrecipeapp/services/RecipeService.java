package com.learning.springbootrecipeapp.services;

import com.learning.springbootrecipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);
}
