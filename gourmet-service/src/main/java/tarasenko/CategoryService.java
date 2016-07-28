package tarasenko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tarasenko.entity.Category;

import java.util.List;

/**
 * @author tarasenko
 * @since 22.07.2016
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryDAO categoryDAO;

    public Category getCategoryById(String id){
        return categoryDAO.findById(id);
    }

    public List<Category> getCategories() {
        return categoryDAO.findAllCategories();
    }
}
