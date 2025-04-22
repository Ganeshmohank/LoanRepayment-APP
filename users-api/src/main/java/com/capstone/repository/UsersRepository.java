package com.capstone.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capstone.model.Users;

@Repository
public interface UsersRepository extends CrudRepository<Users,Integer> {

	public Users getByCustid(int custid);


}
