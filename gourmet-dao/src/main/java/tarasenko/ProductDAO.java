package tarasenko;

import tarasenko.entity.Product;

import java.util.List;

/**
 * @author tarasenko
 * @since 22.07.2016
 */
public interface ProductDAO {
    Product findById(String id);

    void saveProduct(Product product);

    void updateProduct(Product product);

    void deleteProduct(Product product);

    List<Product> findAllProducts();
}
