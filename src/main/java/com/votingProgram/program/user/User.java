package com.votingProgram.program.user;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
public class User {

    @NotBlank(message = "Id must be defined")
    @Id
    private String login;

    @NotBlank(message = "Password must be defined")
    private String password;

    @NotBlank(message = "Name must be defined")
    private String name;

    @NotBlank(message = "Lastname must be defined")
    private String lastName;

    @NotBlank(message = "Age must be defined")
    private String age;

    @NotBlank(message = "Gender must be defined")
    private String gender;

    public User() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
}
