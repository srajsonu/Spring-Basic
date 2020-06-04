package ml.srajsonu.springbasic.commands;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


public class UserCommand {

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(min = 5, max = 10)
    private String name;

    @NotBlank
    @Size(min = 5, max = 10)
    private String password;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
