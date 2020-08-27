package br.com.casamagalhaes.estagiocm.repository;

import br.com.casamagalhaes.estagiocm.model.User;

import java.util.List;

public interface UserRepository {

    void save(User user);

    void update(User user);

    List<User> search(String name, String birthday);

    User search(Long id);

    void delete(User user);

    User validateLogin(String name, String password);
}
