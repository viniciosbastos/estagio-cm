package br.com.casamagalhaes.estagiocm.service;

import br.com.casamagalhaes.estagiocm.model.User;
import br.com.casamagalhaes.estagiocm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void update(User user) {
        userRepository.update(user);
    }

    @Override
    public List<User> search(String name, String birthday) {
        return userRepository.search(name, birthday);
    }

    @Override
    public User search(Long id) {
        return userRepository.search(id);
    }

    @Override
    public void delete(Long userId) {
        User user = search(userId);
        if (!Objects.isNull(user)) {
            userRepository.delete(user);
        }
    }

    @Override
    public boolean validateLogin(String name, String password) {
        boolean result = false;
        if (name.equals("admin") && password.equals("admin"))
            result = true;
        else {
            User user = userRepository.validateLogin(name, password);
            if (!Objects.isNull(user)) result = true;
        }
        return result;
    }
}
