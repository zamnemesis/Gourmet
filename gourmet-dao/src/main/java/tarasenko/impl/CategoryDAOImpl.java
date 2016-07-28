package tarasenko.impl;

import org.springframework.stereotype.Repository;
import tarasenko.AbstractDAO;
import tarasenko.CategoryDAO;
import tarasenko.entity.Category;

import java.util.List;

/**
 * @author tarasenko
 * @since 22.07.2016
 */
@Repository
public class CategoryDAOImpl extends AbstractDAO<String, Category> implements CategoryDAO {
    @Override
    public Category findById(String id) {
        return findById(id);
    }

    @Override
    public void saveCategory(Category category) {
        persist(category);
    }

    @Override
    public void updateCategory(Category category) {

    }

    @Override
    public void deleteCategory(Category category) {

    }

    @Override
    public List<Category> findAllCategories() {
        return findAll();
    }
}
