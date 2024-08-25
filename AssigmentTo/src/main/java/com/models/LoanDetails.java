package com.models;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Embeddable
public class LoanDetails {
    private String borrowerName;
    private String loanType;
    private int loanAmount;
    private double interestRate;
    private String loanStartDate;
    private String loanEndDate;

 
}