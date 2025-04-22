package com.capstone.service;

import com.capstone.model.Users;

public interface UserService {
	public Users findByCustidAndPassword(Integer custid,String password);
}
