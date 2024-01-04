package com.votingProgram.program.user;

import com.votingProgram.program.user.account.AccountAlreadyExistsException;
import com.votingProgram.program.user.account.AccountNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> viewUsersList() {
        return userRepository.findAll();
    }

    public User viewUserDetails(String login) {
        return userRepository.findById(login).orElseThrow(() -> new AccountNotFoundException(login));
    }

    public void addUserToRepository(User user) {
        if(userRepository.existsById(user.getAccount().getLogin())){
            throw new AccountAlreadyExistsException(user.getAccount().getLogin());
        }
        userRepository.save(user);
    }

    public void removeUserFromRepository(String login) {
        userRepository.delete(login);

    }


}
