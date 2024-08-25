package com.services;

import com.models.LoanAccount;

public interface LoanAccountIntegrationService {
	
	public LoanAccount fetchLoanAccountDetails(String loanAccountNumber);
	
}
