package com.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.models.LoanAccount;

@Service
public class LoanAccountIntegrationSerciceImpl implements LoanAccountIntegrationService{
	
    private final RestTemplate restTemplate = new RestTemplate();

    @Override
    public LoanAccount fetchLoanAccountDetails(String loanAccountNumber) {
        String url = "http://demo0951179.mockable.io/loanaccount/1";
        return restTemplate.getForObject(url, LoanAccount.class);
        	
     
    }
}