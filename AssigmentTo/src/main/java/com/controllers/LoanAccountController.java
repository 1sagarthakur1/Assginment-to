package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.models.EmiDetails;
import com.models.LoanAccount;
import com.models.LoanDto;
import com.services.LoanAccountServiceImpl;


@RestController
public class LoanAccountController {

    @Autowired
    private LoanAccountServiceImpl loanAccountService;
    


    @GetMapping("/loanaccount/{loanAccountNumber}")
    public ResponseEntity<List<LoanDto>> getLoanAccount(@PathVariable("loanAccountNumber") String loanAccountNumber) {
    	
        return new ResponseEntity<List<LoanDto>>(loanAccountService.getLoanAccountDetails(loanAccountNumber),HttpStatus.OK);
    }
    
    
    
}
