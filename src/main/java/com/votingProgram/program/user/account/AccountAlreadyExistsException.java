package com.votingProgram.program.user.account;

public class AccountAlreadyExistsException extends RuntimeException{
    public AccountAlreadyExistsException(String login){
        super("A account with login: " + login + " already exists.");
    }
}
