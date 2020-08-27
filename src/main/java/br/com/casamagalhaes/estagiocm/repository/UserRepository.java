package br.com.casamagalhaes.estagiocm.repository;

import br.com.casamagalhaes.estagiocm.model.User;

import java.util.List;

public interface UserRepository {

    void save(User user);

    List<User> search(String name, String birthday);

    User search(Long id);

    void delete(User user);
}
