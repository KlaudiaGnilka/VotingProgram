package com.votingProgram.program.user;

import com.votingProgram.program.user.account.Account;
import jakarta.validation.constraints.NotBlank;

public class User {

    @NotBlank(message = "Name must be defined")
    private final String name;

    @NotBlank(message = "Lastname must be defined")
    private final String lastName;

    @NotBlank(message = "Age must be defined")
    private String age;

    @NotBlank(message = "Gender must be defined")
    private final String gender;
    private Account account;

    public User(String name, String lastName, String age, String gender, Account account) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
}
