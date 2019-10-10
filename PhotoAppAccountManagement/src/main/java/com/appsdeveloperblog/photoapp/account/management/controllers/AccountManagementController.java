package com.appsdeveloperblog.photoapp.account.management.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountManagementController {


	@GetMapping(value = "/account/management")
	public String getMethodName() {
		return new String("Account management working");
	}

}
