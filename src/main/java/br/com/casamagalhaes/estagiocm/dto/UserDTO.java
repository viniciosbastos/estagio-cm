package br.com.casamagalhaes.estagiocm.dto;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class UserDTO {

    private Long id;
    private String name;
    private String birthday;
    private String password;
    private String confirmPassword;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public List<String> validate() {
        List<String> errors = new LinkedList<String>();
        if (Objects.isNull(this.name) || Objects.equals(this.name, ""))
            errors.add("Nome de usuário não pode ser vazio.");
        if (Objects.isNull(this.birthday) || Objects.equals(this.birthday, ""))
            errors.add("Data de nascimento não pode ser vazia.");
        if (Objects.isNull(this.password) || Objects.equals(this.password, ""))
            errors.add("Senha não pode ser vazio.");
        if (Objects.isNull(this.confirmPassword) || Objects.equals(this.confirmPassword, ""))
            errors.add("Confirmação de senha não pode ser vazio.");
        if (!Objects.equals(this.password, this.confirmPassword))
            errors.add("Senha e Confirmação de senha devem ser iguais.");

        return errors;
    }
}
