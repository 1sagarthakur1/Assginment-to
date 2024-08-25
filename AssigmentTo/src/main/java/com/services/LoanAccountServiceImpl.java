package com.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.models.EmiDetails;
import com.models.LoanAccount;
import com.models.LoanDto;
import com.repository.LoanAccountRepo;

@Service
public class LoanAccountServiceImpl {

	@Autowired
	private LoanAccountIntegrationService loanAccountIntegrationService;
	
	@Autowired
	private LoanAccountRepo loanAccountRepo;

    public List<LoanDto> getLoanAccountDetails(String loanAccountNumber) {

        LoanAccount loanAccount = loanAccountIntegrationService.fetchLoanAccountDetails(loanAccountNumber);
        System.out.println(loanAccount);
        List<LoanDto> listDtoList = new ArrayList<>();
        
        List<EmiDetails> list = loanAccount.getEmiDetails();
        for(int i=0;i<list.size();i++) {
        	LoanDto loanDto = new LoanDto();
        	loanDto.setLoanAccountNumber(loanAccountNumber);
        	loanDto.setDueDate(list.get(i).getDueDate());
        	loanDto.setEmiaccount(list.get(i).getEmiAmount());
        	listDtoList.add(loanDto);
        }
        
        
         loanAccountRepo.save(loanAccount);
         return listDtoList;
    }
}