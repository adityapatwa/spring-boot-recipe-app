package com.learning.springbootrecipeapp.controllers;

import com.learning.springbootrecipeapp.domain.Recipe;
import com.learning.springbootrecipeapp.services.RecipeService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

class RecipeControllerTest {

    @Mock
    RecipeService recipeService;

    RecipeController recipeController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        recipeController = new RecipeController(recipeService);
    }

    @Test
    void getRecipeView() throws Exception {
        Recipe recipe = new Recipe();
        recipe.setId(1L);

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(recipeController).build();
        when(recipeService.findById(1L)).thenReturn(recipe);

        mockMvc.perform(MockMvcRequestBuilders.get("/recipe/1"))
                .andExpect(status().isOk())
                .andExpect(view().name("recipe/recipe"))
                .andExpect(model().attribute("recipe", Matchers.is(recipe)));
    }

}