package tarasenko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tarasenko.dao.UserDAO;
import tarasenko.dao.entity.User;

/**
 * @author tarasenko
 * @since 01.06.2016
 */
@Service
@Transactional
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public User getUser(Long id) {
        return userDAO.findById(id);
    }
}
