package br.com.jose.user_api.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.jose.user_api.domain.User;
import br.com.jose.user_api.repositories.UserRepository;
import br.com.jose.user_api.services.UserService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository repository;

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
