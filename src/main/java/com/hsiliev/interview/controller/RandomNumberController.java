package com.hsiliev.interview.controller;

import com.hsiliev.interview.data.UserRepository;
import com.hsiliev.interview.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RandomNumberController {

  public static final int BOUND = 1000;

  private final UserRepository repository;

  public RandomNumberController(UserRepository repository) {
    this.repository = repository;
  }

  @PostMapping(path = "/user/{name}")
  public void storeUser(@PathVariable("name") String name) {
    Random randomGenerator = new Random();
    int randomKey = randomGenerator.nextInt(BOUND);

    User user = new User();
    user.setName(name);
    user.setRandomKey(randomKey);

    repository.save(user);
  }

  @GetMapping(path = "/user/last")
  public User getLastUser() {
    return repository.findFirstByOrderByIdDesc();
  }
}
