package br.com.candido.spring_security_jwt.repository;

import java.util.Optional;

import br.com.candido.spring_security_jwt.entity.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, String> {
    Optional<User> findByUsername(String username);
}