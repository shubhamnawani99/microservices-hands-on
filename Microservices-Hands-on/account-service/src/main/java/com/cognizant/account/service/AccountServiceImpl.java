package com.cognizant.account.service;

import org.springframework.stereotype.Service;

import com.cognizant.account.model.Account;

@Service
public class AccountServiceImpl implements IAccountService {

	// Return dummy account details 
	@Override
	public Account getAccountDetails() {
		return new Account("00987987973432", "savings", 234343D);
	}

}
