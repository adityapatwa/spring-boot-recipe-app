package com.learning.springbootrecipeapp.repositories;

import com.learning.springbootrecipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
