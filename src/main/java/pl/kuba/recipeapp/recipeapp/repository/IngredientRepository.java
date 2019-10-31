package pl.kuba.recipeapp.recipeapp.repository;

import org.springframework.data.repository.CrudRepository;
import pl.kuba.recipeapp.recipeapp.model.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, Long> {
}
