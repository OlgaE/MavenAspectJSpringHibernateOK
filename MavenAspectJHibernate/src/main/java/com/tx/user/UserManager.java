package com.tx.user;

import java.util.List;

import com.tx.model.User;

public interface UserManager {

  void insertUser(User user);
	
  User getUserById(int userId);
	
  User getUser(String username);
	
  /* List<User> getUsers();*/
}