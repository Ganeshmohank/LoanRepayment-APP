package com.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.model.PaymentInfo;

public interface PaymentRepository extends JpaRepository<PaymentInfo,Integer>{

}

