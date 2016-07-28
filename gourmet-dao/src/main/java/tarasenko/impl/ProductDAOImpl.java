package tarasenko.impl;

import org.springframework.stereotype.Repository;
import tarasenko.AbstractDAO;
import tarasenko.ProductDAO;
import tarasenko.entity.Product;

import java.util.List;

/**
 * @author tarasenko
 * @since 22.07.2016
 */
@Repository
public class ProductDAOImpl extends AbstractDAO<String, Product> implements ProductDAO{
    @Override
    public Product findById(String id) {
        return getByKey(id);
    }

    @Override
    public void saveProduct(Product product) {
        persist(product);
    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void deleteProduct(Product product) {

    }

    @Override
    public List<Product> findAllProducts() {
        return findAll();
    }
}
