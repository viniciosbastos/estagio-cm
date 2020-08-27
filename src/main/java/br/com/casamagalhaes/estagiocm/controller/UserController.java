package br.com.casamagalhaes.estagiocm.controller;

import br.com.caelum.vraptor.*;
import br.com.caelum.vraptor.view.Results;
import br.com.casamagalhaes.estagiocm.dto.UserDTO;
import br.com.casamagalhaes.estagiocm.model.User;
import br.com.casamagalhaes.estagiocm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Resource
public class UserController {

    private Result result;

    @Autowired
    private UserService userService;

    public UserController(Result result) {
        this.result = result;
    }

    @Get("/users")
    @Transactional
    public void user() {
        List<User> list = userService.search("", "");
        result.include("usuarios", list);
    }

    @Get("/users/create")
    public void create() {}

    @Post("/users/create")
    @Transactional
    public void create(UserDTO user) {
        List<String> errors = user.validate();
        if (errors.size() > 0) {
            result.use(Results.json()).withoutRoot().from(errors).serialize();
            return;
        }
        userService.save(new User(user));
        result.use(Results.json()).withoutRoot().from("/users").serialize();
    }

    @Delete("/users/delete/{userId}")
    public void delete(Long userId) {
        userService.delete(userId);
        result.nothing();
    }
}
