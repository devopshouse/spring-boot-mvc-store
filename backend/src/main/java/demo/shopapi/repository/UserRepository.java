package demo.shopapi.repository;


import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.shopapi.entity.User;

/**
 * Created By Zhu Lin on 3/13/2018.
 */

public interface UserRepository extends JpaRepository<User, String> {
    User findByEmail(String email);
    Collection<User> findAllByRole(String role);

}
