package com.learning.springbootrecipeapp.controllers;

import com.learning.springbootrecipeapp.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String index(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
