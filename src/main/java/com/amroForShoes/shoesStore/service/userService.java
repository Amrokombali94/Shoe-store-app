package com.amroForShoes.shoesStore.service;

import com.amroForShoes.shoesStore.entites.Role;
import com.amroForShoes.shoesStore.entites.User;

import java.util.Optional;

public interface userService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
