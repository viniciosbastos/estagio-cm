package br.com.casamagalhaes.estagiocm.model;

import br.com.casamagalhaes.estagiocm.dto.UserDTO;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cm_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String birthday;
    private String password;

    public User() {
    }

    public User(UserDTO user) {
        this.name = user.getName();
        this.birthday = user.getBirthday();
        this.password = user.getPassword();
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
