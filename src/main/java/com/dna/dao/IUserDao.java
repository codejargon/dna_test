package com.dna.dao;

import java.util.List;

import com.dna.model.User;

public interface IUserDao{
   User findUserById(long userId);
	
   List<User> getAllUsers();
}
