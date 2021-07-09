package com.cognizant.loan.service;

import org.springframework.stereotype.Service;

import com.cognizant.loan.model.Loan;

@Service
public class LoanServiceImpl implements ILoanService {

	// Return dummy loan details
	@Override
	public Loan getLoanDetails() {
		return new Loan("H00987987972342", "car", 400000, 3258, 18);
	}

}
