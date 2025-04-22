package com.capstone.service;

import java.util.List;
import com.capstone.model.LoanInfo;

public interface LoanService {		
	
		public List<LoanInfo> getLoan();

		public LoanInfo getLoanAccountDetails(int accNumber);
		public List<LoanInfo> getLoanAccByCust(int custid);

		public LoanInfo getloanDetailsofCustbyLoan(int custid, int accno);
	}


