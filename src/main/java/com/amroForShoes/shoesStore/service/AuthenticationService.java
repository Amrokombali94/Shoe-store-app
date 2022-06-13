package com.amroForShoes.shoesStore.service;

import com.amroForShoes.shoesStore.entites.User;

public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
