package pl.kuba.recipeapp.recipeapp.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import pl.kuba.recipeapp.recipeapp.model.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

    @Modifying(clearAutomatically = true)
    @Query(value = "update Recipe set description = :description, title = :title where id = :id")
    void updateRecipe(@Param("id") long id, @Param("description") String description, @Param("title") String title);
}
