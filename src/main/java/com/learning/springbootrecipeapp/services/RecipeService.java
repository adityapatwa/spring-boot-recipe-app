package com.learning.springbootrecipeapp.services;

import com.learning.springbootrecipeapp.commands.RecipeCommand;
import com.learning.springbootrecipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
