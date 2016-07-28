package tarasenko;

import tarasenko.entity.Ingredient;

import java.util.List;

/**
 * @author tarasenko
 * @since 06.06.2016
 */
public interface IngredientDAO {
    Ingredient findById(String id);

    void saveIngredient(Ingredient ingredient);

    void updateIngredient(Ingredient ingredient);

    void deleteIngredient(Ingredient ingredient);

    List<Ingredient> findAllIngredients();
}
