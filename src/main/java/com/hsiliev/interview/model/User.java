package com.hsiliev.interview.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class User {

  @Id
  @GeneratedValue
  @JsonIgnore
  private long id;

  private int randomKey;
  private String name;

  public User() {
  }

  public void setRandomKey(int key) {
    this.randomKey = key;
  }

  public int getRandomKey() {
    return randomKey;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
