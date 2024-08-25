package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.models.LoanAccount;

@Repository
public interface LoanAccountRepo extends JpaRepository<LoanAccount, Integer> {
	
}
