package ru.semenov.springcourse.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.semenov.springcourse.Model.User;

import java.util.List;


@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(User user) {
        em.persist(user);
    }

    @Override
    public void delete(Long id) {
        em.remove(em.find(User.class, id));
    }

    @Override
    public void edit(User user) {
        em.merge(user);
    }

    @Override
    public User findById(Long id) {
        User user = em.find(User.class, id);
        if (user == null) {
            throw new IllegalArgumentException("User not found with id: " + id);
        }
        return user;
    }

    @Override
    public List<User> findAll() {
        return em.createQuery("FROM User ", User.class).getResultList();
    }
}
