package com.dna.service;

import java.util.List;

import com.dna.model.User;

public interface IUserService {

	List<User> getAllUsers();
	
	User findUserById(long userId);
}
