package com.learning.springbootrecipeapp.services;

import com.learning.springbootrecipeapp.domain.Recipe;

public interface RecipeService {

    Iterable<Recipe> getRecipes();
}
