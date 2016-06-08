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
public class IngredientDAOImpl extends AbstractDAO<Long, Ingredient> implements IngredientDAO {

    @Override
    public Ingredient findById(Long id) {
        return getByKey(id);
    }

    @Override
    public void saveUser(Ingredient User) {

    }

    @Override
    public void updateUser(Ingredient User) {

    }

    @Override
    public void deleteUserById(Long id) {

    }

    @Override
    public List<Ingredient> findAllIngredients() {
        return null;
    }
}
