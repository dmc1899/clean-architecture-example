package com.clean.example.core.usecase.user;

import com.clean.example.core.domain.User;

import java.util.List;

public class FindAllUsersUseCase {

    private final FindAllUsers findAllUsers;

    public FindAllUsersUseCase(FindAllUsers findAllUsers) {
        this.findAllUsers = findAllUsers;
    }

    public List<User> findAllUsers() {
        return findAllUsers.findAllUsers();
    }

}
