package tarasenko.impl;

import org.springframework.stereotype.Repository;
import tarasenko.AbstractDAO;
import tarasenko.RecipeDAO;
import tarasenko.entity.Recipe;

import java.util.List;

/**
 * @author tarasenko
 * @since 22.07.2016
 */
@Repository
public class RecipeDAOImpl extends AbstractDAO<String, Recipe> implements RecipeDAO {

    @Override
    public Recipe findById(String id) {
        return getByKey(id);
    }

    @Override
    public void savePreference(Recipe recipe) {

    }

    @Override
    public void updatePreference(Recipe recipe) {

    }

    @Override
    public void deletePreference(Recipe recipe) {

    }

    @Override
    public List<Recipe> findAllRecipes() {
        return findAll();
    }
}
