package br.com.casamagalhaes.estagiocm.service;

import br.com.casamagalhaes.estagiocm.model.User;
import br.com.casamagalhaes.estagiocm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UserService {

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


}