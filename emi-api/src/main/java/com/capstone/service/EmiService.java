package com.capstone.service;

import java.util.List;

import com.capstone.model.Emi;

public interface EmiService {

	public List<Emi> getEmi();
	public Emi getEmiData(int accNumber);
	public Emi updateEMI(Emi emiObj);
}
