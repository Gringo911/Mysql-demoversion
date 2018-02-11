package service;

import entity.User;

import java.util.List;

/**
 * Created by ВАСЯ on 06.02.2018.
 */
public interface UserService {
    List<User> findAll();

    void save(User user) throws Exception;

    User getById(int id);

    void update(User user);

    void delete(int id);
}
