package com.appsdeveloperblog.photoapp.api.users.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

	@GetMapping(value = "/status/check")
	public String postMethodName() {
		
		return "Succsssful";
	}

}
