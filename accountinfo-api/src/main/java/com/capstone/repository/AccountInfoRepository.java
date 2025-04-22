package com.capstone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capstone.model.AccountInfo;

@Repository
public interface AccountInfoRepository extends CrudRepository<AccountInfo,Integer>{

    List<AccountInfo> findByCustid(int custid);

	

}
