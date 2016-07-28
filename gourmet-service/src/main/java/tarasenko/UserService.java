package tarasenko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tarasenko.entity.User;

import java.util.List;

/**
 * @author tarasenko
 * @since 01.06.2016
 */
@Service
@Transactional
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public User getUser(String id) {
        return userDAO.findById(id);
    }

    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    public List<User> getUsers() {
        return userDAO.findAllUsers();
    }
}
