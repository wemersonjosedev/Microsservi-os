package br.com.jose.user_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jose.user_api.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
