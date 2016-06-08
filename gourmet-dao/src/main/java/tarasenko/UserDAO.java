package tarasenko;

import tarasenko.entity.User;

import java.util.List;

/**
 * @author tarasenko
 * @since 01.06.2016
 */
public interface UserDAO {
    User findById(Long id);

    void saveUser(User User);

    void updateUser(User User);

    void deleteUserById(Long id);

    List<User> findAllUsers();
}
