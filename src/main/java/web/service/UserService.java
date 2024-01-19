package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    void add(User user);

    void delete(Long id);

    void update(User user);

    User findById(Long id);

    List<User> listUsers();
}
