package pl.kuba.recipeapp.recipeapp.service;

import pl.kuba.recipeapp.recipeapp.model.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    Recipe saveRecipe(Recipe command);

    void deleteById(Long id);

    Recipe updateRecipe(Recipe recipe);
}
