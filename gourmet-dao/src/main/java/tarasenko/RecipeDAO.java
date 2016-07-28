package tarasenko;

import tarasenko.entity.Recipe;

import java.util.List;

/**
 * @author tarasenko
 * @since 22.07.2016
 */
public interface RecipeDAO {
    Recipe findById(String id);

    void savePreference(Recipe recipe);

    void updatePreference(Recipe recipe);

    void deletePreference(Recipe recipe);

    List<Recipe> findAllRecipes();
}
