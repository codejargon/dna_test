package com.dna.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dna.dao.IUserDao;
import com.dna.model.User;
import com.dna.service.IUserService;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;

	@Override
	public List<User> getAllUsers() {
		
		return userDao.getAllUsers();

	}

	@Override
	public User findUserById(long userId) {

		return userDao.findUserById(userId);

	}

}
