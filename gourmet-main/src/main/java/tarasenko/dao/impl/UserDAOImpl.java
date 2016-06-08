package tarasenko.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tarasenko.dao.AbstractDAO;
import tarasenko.dao.UserDAO;
import tarasenko.dao.entity.User;

import java.util.List;

/**
 * @author tarasenko
 * @since 01.06.2016
 */
@Repository
public class UserDAOImpl extends AbstractDAO<Long, User> implements UserDAO {

    @Override
    public User findById(Long id) {
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
    public void deleteUserById(Long id) {

    }

    @Override
    public List<User> findAllUsers() {
        return null;
    }
}
