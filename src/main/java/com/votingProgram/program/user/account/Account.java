package com.votingProgram.program.user.account;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;

import java.util.Objects;

public class Account {

    @NotBlank(message = "Login must be defined")
    @Id
    private final String login;

    @NotBlank(message = "Password must be defined")
    private String password;

    public Account(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void changePassword(String login, String oldPassword, String newPassword) {
        this.password = newPassword;
    }

    @Override
    public String toString() {
        return "login: " + login + " \n password: " + password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(login, account.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }
}
