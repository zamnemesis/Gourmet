package tarasenko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tarasenko.entity.Product;

import java.util.List;

/**
 * @author tarasenko
 * @since 22.07.2016
 */
@Service
public class ProductService {
    @Autowired
    private ProductDAO productDAO;

    public Product getProductById(String id) {
        return productDAO.findById(id);
    }

    public List<Product> getProducts() {
        return productDAO.findAllProducts();
    }
}
