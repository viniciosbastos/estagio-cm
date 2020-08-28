package br.com.casamagalhaes.estagiocm.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Scope("session")
public class LoggedUser implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void login(String name) {
        this.name = name;
    }

    public void logout() {
        this.name = null;
    }
}
