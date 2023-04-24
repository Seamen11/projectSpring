package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users = new ArrayList<>();

    public UserRepository() {
        users.add(new User(1L, "admin", "password1", Role.ADMIN));
        users.add(new User(2L, "accountant", "password2", Role.ACCOUNTANT));
        users.add(new User(3L, "client", "password3", Role.CLIENT));
    }

    public User findByUsername(String username) {
        return users.stream().filter(user -> user.getUsername().equals(username)).findFirst().orElse(null);
    }
}
