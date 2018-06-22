package com.dna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dna.model.BaseResponseModel;
import com.dna.model.User;
import com.dna.service.IUserService;

@RestController
@RequestMapping(value = "/api/user")
public class UserController extends BaseController {

	@Autowired
	private IUserService userService;

	/**
	 * returns the list of all users
	 * 
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	ResponseEntity<BaseResponseModel> getAllUsers() {

		List<User> users = userService.getAllUsers();

		return getResponseModel(users, HttpStatus.OK, null);

	}
	

	/**
	 * 
	 * finds the user by id.
	 */

	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	ResponseEntity<BaseResponseModel> findUserById(@PathVariable("userId") long userId) {

		User user = userService.findUserById(userId);

		return getResponseModel(user, HttpStatus.OK, null);

	}

}
