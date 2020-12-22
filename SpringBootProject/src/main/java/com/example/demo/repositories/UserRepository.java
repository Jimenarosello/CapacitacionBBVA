package com.example.demo.repositories;

import com.example.demo.domain.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAllByUsernameContaining(String username);
    List<User> findAllByUsername(String username);
    Optional<User> findById(Long id);

}
