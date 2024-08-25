package com.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class LoanDto {
	public String loanAccountNumber;
	public String dueDate;
	public int emiaccount;
}
