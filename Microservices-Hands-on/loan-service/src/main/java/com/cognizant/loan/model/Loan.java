package com.cognizant.loan.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Loan {

	private String number;
	private String type;
	private Integer loan;
	private Integer emi;
	private Integer tenure;
}
