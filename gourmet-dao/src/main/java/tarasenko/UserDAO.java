package tarasenko;

import tarasenko.entity.User;

import java.util.List;

/**
 * @author tarasenko
 * @since 01.06.2016
 */
public interface UserDAO {
    User findById(String id);

    void saveUser(User User);

    void updateUser(User User);

    void deleteUserById(String id);

    List<User> findAllUsers();
}
