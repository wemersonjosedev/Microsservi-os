package br.com.jose.user_api.resources.impl;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jose.user_api.domain.User;
import br.com.jose.user_api.resources.UserResource;
import br.com.jose.user_api.services.UserService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/user")
public class UserResourceImpl implements UserResource{

    private final UserService service;

    @Override
    public ResponseEntity<User> findById(Long id) {
        return ResponseEntity.ok().body(service.findById(id));
    }

    @Override
    public ResponseEntity<List<User>> findALL() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
