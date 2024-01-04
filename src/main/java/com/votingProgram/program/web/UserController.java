package com.votingProgram.program.web;

import com.votingProgram.program.user.User;
import com.votingProgram.program.user.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Iterable<User> getAll() {
        return userService.viewUsersList();
    }

    @GetMapping("{login}")
    public User getUser(@PathVariable String login) {
        return userService.viewUserDetails(login);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@RequestBody User user) {
        userService.addUserToRepository(user);
    }

    @DeleteMapping("delete/{login}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable String login) {
        userService.removeUserFromRepository(login);
    }

}
