package com.cognizant.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.account.model.Account;
import com.cognizant.account.service.IAccountService;

@RestController
public class AccountController {

	@Autowired
	private IAccountService aservice;
	/*
	 * @URL: http://localhost:8080/accounts/1
	 */
	@GetMapping(value = "/accounts/{number}")
	public ResponseEntity<Account> getAccountDetails(@PathVariable Integer number) {
		Account accountDetails = aservice.getAccountDetails();
		return new ResponseEntity<Account>(accountDetails, HttpStatus.OK);
	}
}
