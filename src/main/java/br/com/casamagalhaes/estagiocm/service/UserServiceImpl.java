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
}
