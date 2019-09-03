package pl.kuba.recipeapp.recipeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.kuba.recipeapp.recipeapp.model.Recipe;
import pl.kuba.recipeapp.recipeapp.service.RecipeService;

import java.util.Set;

@RestController
@RequestMapping("/api/recipe/")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping("getAllRecepies")
    public Set<Recipe> getAllRecepies() {
        return recipeService.getRecipes();
    }

    @GetMapping("findById")
    public Recipe findById(Long id) {
        return recipeService.findById(id);
    }

    @PostMapping("saveRecipe")
    public Recipe saveRecipe(@RequestBody Recipe recipe) {
        return recipeService.saveRecipe(recipe);
    }

    @DeleteMapping("deleteById")
    public void deleteById(Long id) {
        recipeService.deleteById(id);
    }

    @PutMapping("updateRecipe")
    public Recipe updatRecipe(@RequestBody Recipe recipe) {
        return recipeService.updateRecipe(recipe);
    }
}
