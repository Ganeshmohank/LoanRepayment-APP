package com.capstone.repository;

import com.capstone.model.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SavingPaymentHistoryRepository extends JpaRepository<SavingPaymentHistory,Integer>{
}
