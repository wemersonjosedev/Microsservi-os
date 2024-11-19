package br.com.jose.user_api.services;

import java.util.List;

import br.com.jose.user_api.domain.User;

public interface UserService {
    User findById(Long id);
    List<User> findAll();
}
