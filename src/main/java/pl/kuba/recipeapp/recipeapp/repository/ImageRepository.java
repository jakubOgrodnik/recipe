package pl.kuba.recipeapp.recipeapp.repository;

import org.springframework.data.repository.CrudRepository;
import pl.kuba.recipeapp.recipeapp.model.Image;

public interface ImageRepository extends CrudRepository<Image, Long> {
}
