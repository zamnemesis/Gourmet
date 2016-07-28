package tarasenko;

import tarasenko.entity.Category;

import java.util.List;

/**
 * @author tarasenko
 * @since 22.07.2016
 */
public interface CategoryDAO {
    Category findById(String id);

    void saveCategory(Category category);

    void updateCategory(Category category);

    void deleteCategory(Category category);

    List<Category> findAllCategories();
}
