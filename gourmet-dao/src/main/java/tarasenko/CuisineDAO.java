package tarasenko;

import tarasenko.entity.Cuisine;

import java.util.List;

/**
 * @author tarasenko
 * @since 22.07.2016
 */
public interface CuisineDAO {
    Cuisine findById(String id);

    void saveCuisine(Cuisine cuisine);

    void updateCuisine(Cuisine cuisine);

    void deleteCuisine(Cuisine cuisine);

    List<Cuisine> findAllCuisines();
}
