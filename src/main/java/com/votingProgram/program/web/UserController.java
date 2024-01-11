package com.votingProgram.program.web;

import com.votingProgram.program.user.User;
import com.votingProgram.program.user.UserRepository;
import com.votingProgram.program.user.AccountNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public Iterable<User> getAll() {
        return userRepository.findAll();
    }

    @GetMapping("{login}")
    public User getUser(@PathVariable String login) {
        Optional<User> user = userRepository.findById(login);
        if(user.isEmpty()){
            throw new AccountNotFoundException(login);
        } else {
            return user.get();
        }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@RequestBody User user) {
        userRepository.save(user);
    }

    @DeleteMapping("/delete/{login}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable String login) {
        Optional<User> user = userRepository.findById(login);
        if(user.isEmpty()){
            throw new AccountNotFoundException(login);
        } else {
            userRepository.delete(user.get());
        }
    }

}
