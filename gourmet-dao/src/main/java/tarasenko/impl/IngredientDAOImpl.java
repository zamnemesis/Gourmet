package tarasenko.impl;

import org.springframework.stereotype.Repository;
import tarasenko.AbstractDAO;
import tarasenko.IngredientDAO;
import tarasenko.entity.Ingredient;

import java.util.List;

/**
 * @author tarasenko
 * @since 06.06.2016
 */
@Repository
public class IngredientDAOImpl extends AbstractDAO<String, Ingredient> implements IngredientDAO{

    @Override
    public Ingredient findById(String id) {
        return getByKey(id);
    }

    @Override
    public void saveIngredient(Ingredient ingredient) {

    }

    @Override
    public void updateIngredient(Ingredient ingredient) {

    }

    @Override
    public void deleteIngredient(Ingredient ingredient) {
        delete(ingredient);
    }

    @Override
    public List<Ingredient> findAllIngredients() {
        return findAll();
    }
}
