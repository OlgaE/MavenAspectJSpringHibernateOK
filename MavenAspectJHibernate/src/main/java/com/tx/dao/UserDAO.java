package com.tx.dao;

import java.util.List;

import com.tx.model.User;

public interface UserDAO {

  void insertUser(User user);
  
/*  User getUserById(int userId);
  
  User getUser(String username);
  
  List<User> getUsers();*/
}
