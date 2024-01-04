package com.votingProgram.program.user;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface UserRepository extends CrudRepository<User, String> {
    void delete(String login);
}
