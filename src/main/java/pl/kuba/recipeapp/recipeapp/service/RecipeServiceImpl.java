package pl.kuba.recipeapp.recipeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.kuba.recipeapp.recipeapp.model.Recipe;
import pl.kuba.recipeapp.recipeapp.repository.RecipeRepository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    @Override
    @Transactional(readOnly = true)
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll()
                .iterator()
                .forEachRemaining(recipeSet::add);
        return recipeSet;
    }

    @Override
    @Transactional(readOnly = true)
    public Recipe findById(Long l) {
        Optional<Recipe> recipeOptional = recipeRepository.findById(l);

        if (!recipeOptional.isPresent()) {
            throw new RuntimeException("Recipe not found");
        }
        return recipeOptional.get();
    }

    @Override
    @Transactional
    public Recipe saveRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        recipeRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Recipe updateRecipe(Recipe recipe) {
        recipeRepository.updateRecipe(recipe.getId(), recipe.getDescription(), recipe.getTitle());
        return findById(recipe.getId());
    }
}
