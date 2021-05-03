package viewmodels;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

public class UserVM {
    Long id;
    @JsonProperty(value = "login", required = true)
    @NotNull(message="login is required")
    String login;
    @JsonProperty(value = "password", required = true)
    @NotNull(message="password is required")
    String password;

    public UserVM() {
    }

    public UserVM(Long id, @NotNull(message = "login is required") String login, @NotNull(message = "password is required") String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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
        UserVM userVM = (UserVM) o;
        return Objects.equals(login, userVM.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login);
    }
}
