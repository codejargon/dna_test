package com.dna.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dna.model.User;
import com.dna.security.JwtGenerator;

@RestController
@RequestMapping(value = "/app")
public class AppController extends BaseController {
	

	private JwtGenerator jwtGenerator;

	public AppController(JwtGenerator jwtGenerator) {
		this.jwtGenerator = jwtGenerator;
	}

	@RequestMapping(value = "/generate", method = RequestMethod.POST)
	public String generate(@RequestBody final User user) {
		return jwtGenerator.generate(user);
	}


}
