package tarasenko.impl;

import org.springframework.stereotype.Repository;
import tarasenko.AbstractDAO;
import tarasenko.CuisineDAO;
import tarasenko.entity.Cuisine;

import java.util.List;

/**
 * @author tarasenko
 * @since 22.07.2016
 */
@Repository
public class CuisineDAOImpl extends AbstractDAO<String, Cuisine> implements CuisineDAO {
    @Override
    public Cuisine findById(String id) {
        return getByKey(id);
    }

    @Override
    public void saveCuisine(Cuisine cuisine) {
        persist(cuisine);
    }

    @Override
    public void updateCuisine(Cuisine cuisine) {

    }

    @Override
    public void deleteCuisine(Cuisine cuisine) {

    }

    @Override
    public List<Cuisine> findAllCuisines() {
        return findAll();
    }
}
