package br.com.casamagalhaes.estagiocm.controller;

import br.com.caelum.vraptor.*;
import br.com.casamagalhaes.estagiocm.model.Usuario;

@Resource
public class UserController {

    private Result result;

    public UserController(Result result) {
        this.result = result;
    }

    @Get("/users")
    public void user() {}

    @Post("/users/save")
    public void saveUser(Usuario user) {

    }
}
