package br.com.casamagalhaes.estagiocm.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.com.casamagalhaes.estagiocm.component.LoggedUser;
import br.com.casamagalhaes.estagiocm.dto.UserDTO;
import br.com.casamagalhaes.estagiocm.model.User;
import br.com.casamagalhaes.estagiocm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

@Resource
public class LoginController {

    private Result result;

    private LoggedUser loggedUser;

    @Autowired
    private UserService userService;

    private LoginController(Result result, LoggedUser loggedUser) {
        this.result = result;
        this.loggedUser = loggedUser;
    }

    @Get("/")
    public void login() {}

    @Post("/login")
    public void login(UserDTO user) {
        if (user.getName() != null && user.getPassword() != null) {
            boolean validUser = userService.validateLogin(user.getName(), user.getPassword());
            if (validUser) {
                loggedUser.login(user.getName());
//                result.redirectTo(UserController.class).user();
                result.use(Results.json()).withoutRoot().from("/users").serialize();
            }
            result.nothing();
        }
    }
}
