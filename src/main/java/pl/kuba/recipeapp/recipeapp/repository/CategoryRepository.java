package pl.kuba.recipeapp.recipeapp.repository;

import org.springframework.data.repository.CrudRepository;
import pl.kuba.recipeapp.recipeapp.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
