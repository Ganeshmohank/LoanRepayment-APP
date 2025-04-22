package com.capstone.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.capstone.model.AccountInfo;
public interface AccountInfoService {
	public List<AccountInfo> getallaccountInfo();

    public List<AccountInfo> getAcountsByCustId(int custid);

    public AccountInfo updateBalence(AccountInfo accObj);

}
