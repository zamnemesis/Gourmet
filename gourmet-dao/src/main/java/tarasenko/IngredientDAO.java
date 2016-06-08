package tarasenko;

import tarasenko.entity.Ingredient;

import java.util.List;

/**
 * @author tarasenko
 * @since 06.06.2016
 */
public interface IngredientDAO {
    Ingredient findById(Long id);

    void saveUser(Ingredient User);

    void updateUser(Ingredient User);

    void deleteUserById(Long id);

    List<Ingredient> findAllIngredients();
}
