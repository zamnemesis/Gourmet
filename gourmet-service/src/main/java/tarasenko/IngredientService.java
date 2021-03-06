package tarasenko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tarasenko.entity.Ingredient;

import java.util.List;

/**
 * @author tarasenko
 * @since 06.06.2016
 */
@Service
@Transactional
public class IngredientService {
    @Autowired
    private IngredientDAO ingredientDAO;

    public Ingredient getIngredient(String id) {
        return ingredientDAO.findById(id);
    }

    public List<Ingredient> getIngredients() {
        return ingredientDAO.findAllIngredients();
    }
}
