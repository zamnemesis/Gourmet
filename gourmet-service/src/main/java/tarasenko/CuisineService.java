package tarasenko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tarasenko.entity.Cuisine;

import java.util.List;

/**
 * @author tarasenko
 * @since 22.07.2016
 */
@Service
public class CuisineService {
    @Autowired
    private CuisineDAO cuisineDAO;

    public Cuisine getCuisineById(String id) {
        return cuisineDAO.findById(id);
    }

    public List<Cuisine> getCuisines() {
        return cuisineDAO.findAllCuisines();
    }
}
