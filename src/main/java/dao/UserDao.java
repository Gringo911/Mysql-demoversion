package dao;

import entity.User;

import java.util.List;

/**
 * Created by ВАСЯ on 06.02.2018.
 */
public interface UserDao {
    void save(User user);

    User getById(int id);

    List<User> findAll();

    void update(User user);

    void delete(int id);


}
