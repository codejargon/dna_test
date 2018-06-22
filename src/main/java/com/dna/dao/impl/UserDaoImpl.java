package com.dna.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.dna.dao.IUserDao;
import com.dna.model.User;

@Repository
@Transactional
public class UserDaoImpl implements IUserDao{
	
	@PersistenceContext
	private EntityManager emf;

	@Override
	public User findUserById(long userId) {
		// TODO Auto-generated method stub
		User user = emf.find(User.class, userId);		
		return user;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = emf.unwrap(Session.class).createCriteria(User.class).list();
		return users;
	}

}
