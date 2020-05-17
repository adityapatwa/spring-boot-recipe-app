package com.learning.springbootrecipeapp.service;

import com.learning.springbootrecipeapp.domain.Recipe;

public interface RecipeService {

    Iterable<Recipe> getRecipes();
}
