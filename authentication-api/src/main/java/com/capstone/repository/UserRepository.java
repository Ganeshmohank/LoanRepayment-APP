package com.capstone.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capstone.model.Users;
@Repository
public interface UserRepository extends CrudRepository<Users,Integer> {
	public Users findByCustidAndPassword(Integer custid,String password);
}
