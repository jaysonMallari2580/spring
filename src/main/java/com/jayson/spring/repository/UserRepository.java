package com.jayson.spring.repository;

import com.jayson.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
//@CrossOrigin(origins = "http://localhost:4200/")
public interface UserRepository extends JpaRepository<User, Long> {

}
