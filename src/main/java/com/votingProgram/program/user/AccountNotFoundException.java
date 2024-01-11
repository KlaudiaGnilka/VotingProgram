package com.votingProgram.program.user;

public class AccountNotFoundException extends RuntimeException{
    public AccountNotFoundException(String login) {
        super("Account with login: " + login + " not found.");
    }
}
