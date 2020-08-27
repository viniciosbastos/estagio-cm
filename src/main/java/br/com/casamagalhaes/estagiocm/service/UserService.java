package br.com.casamagalhaes.estagiocm.service;

import br.com.casamagalhaes.estagiocm.model.User;

import java.util.List;

public interface UserService {

    void save(User user);

    void update(User user);

    List<User> search(String name, String birthday);

    User search(Long id);

    void delete(Long uderId);
}
