package com.in10se.security.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Document("user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private String id;

  @Size(min = 4, max = 255, message = "Minimum username length: 4 characters")

  private String username;

  private String email;

  @Size(min = 8, message = "Minimum password length: 8 characters")
  private String password;

  @ElementCollection(fetch = FetchType.EAGER)
  List<Role> roles;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = UUID.randomUUID().toString();
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public List<Role> getRoles() {
    return roles;
  }

  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }

}
