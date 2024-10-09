package ru.semenov.springcourse.Service;


import ru.semenov.springcourse.Model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findById(Long id);

    void save(User user);

    void delete(Long id);

    void edit(User user);
}
