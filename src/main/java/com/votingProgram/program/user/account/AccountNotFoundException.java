package com.votingProgram.program.user.account;

public class AccountNotFoundException extends RuntimeException{
    public AccountNotFoundException(String login) {
        super("Account with login: " + login + " not found.");
    }
}
