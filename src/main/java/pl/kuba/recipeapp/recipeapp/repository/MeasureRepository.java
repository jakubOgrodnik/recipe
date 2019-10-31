package pl.kuba.recipeapp.recipeapp.repository;

import org.springframework.data.repository.CrudRepository;
import pl.kuba.recipeapp.recipeapp.model.Measure;

public interface MeasureRepository extends CrudRepository<Measure, Long> {
}
