package tarasenko.impl;

import org.springframework.stereotype.Repository;
import tarasenko.AbstractDAO;
import tarasenko.UserDAO;
import tarasenko.entity.User;

import java.util.List;

/**
 * @author tarasenko
 * @since 01.06.2016
 */
@Repository
public class UserDAOImpl extends AbstractDAO<String, User> implements UserDAO {

    @Override
    public User findById(String id) {
        return getByKey(id);
    }

    @Override
    public void saveUser(User user) {
        persist(user);
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(User user) {
        delete(user);
    }

    @Override
    public List<User> findAllUsers() {
        return findAll();
    }
}
