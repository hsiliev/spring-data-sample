package com.hsiliev.interview.data;

import com.hsiliev.interview.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

  List<User> findByName(String userName);

  User findById(long id);

  User findFirstByOrderByIdDesc();
}