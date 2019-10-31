package pl.kuba.recipeapp.recipeapp.repository;

import org.springframework.data.repository.CrudRepository;
import pl.kuba.recipeapp.recipeapp.model.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
