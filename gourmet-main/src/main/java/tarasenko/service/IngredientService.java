package tarasenko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tarasenko.dao.IngredientDAO;
import tarasenko.dao.entity.Ingredient;

/**
 * @author tarasenko
 * @since 06.06.2016
 */
@Service
@Transactional
public class IngredientService {
    @Autowired
    private IngredientDAO ingredientDAO;

    public Ingredient getIngredient(Long id) {
        return ingredientDAO.findById(id);
    }
}
