package tarasenko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tarasenko.entity.Recipe;

import java.util.List;

/**
 * @author tarasenko
 * @since 22.07.2016
 */
@Service
public class RecipeService {
    @Autowired
    private RecipeDAO recipeDAO;

    public Recipe getRecipeById(String id) {
        return recipeDAO.findById(id);
    }

    public List<Recipe> getRecipes() {
        return recipeDAO.findAllRecipes();
    }
}
