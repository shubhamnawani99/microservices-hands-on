package com.cognizant.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loan.model.Loan;
import com.cognizant.loan.service.ILoanService;

@RestController
public class LoanController {

	@Autowired
	private ILoanService lservice;
	/*
	 * @URL: http://localhost:8081/loans/1
	 */
	@GetMapping(value = "/loans/{number}")
	public ResponseEntity<Loan> getLoanDetails(@PathVariable Integer number) {
		Loan loanDetails = lservice.getLoanDetails();
		return new ResponseEntity<Loan>(loanDetails, HttpStatus.OK);
	}
}
