package com.capstone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.model.Emi;
import com.capstone.repository.EmiRepository;
@Service
public class EmiServiceImp implements EmiService {
	@Autowired
	private EmiRepository repo;

	@Override
	public List<Emi> getEmi() {
		List<Emi> emilist = (List<Emi>) repo.findAll();
		return emilist;

	}
    @Override
    public Emi getEmiData(int accNumber) {
    	System.out.println(repo.findByLoanaccno(accNumber));
         return repo.findByLoanaccno(accNumber);
    }
	@Override
	public Emi updateEMI(Emi emiObj) {
		return repo.save(emiObj);
		
	}
    

}
