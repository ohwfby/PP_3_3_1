package ru.semenov.springcourse.dao;


import ru.semenov.springcourse.Model.User;

import java.util.List;

public interface UserDAO {
    void save(User user);

    void delete(Long id);

    void edit(User user);

    User findById(Long id);

    List<User> findAll();
}
