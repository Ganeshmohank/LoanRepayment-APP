package com.capstone.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountInfo {
	@Id
	private int accno;
	private int custid;
	private String branch_name;
	private String ifsc;
	private String savingsamount;
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getSavingsamount() {
		return savingsamount;
	}
	public void setSavingsamount(String savingsamount) {
		this.savingsamount = savingsamount;
	}
	@Override
	public String toString() {
		return "accountinfo [accno=" + accno + ", custid=" + custid + ", branch_name=" + branch_name + ", ifsc=" + ifsc
				+ ", savingsamount=" + savingsamount + "]";
	}
	public AccountInfo(int accno, int custid, String branch_name, String ifsc, String savingsamount) {
		super();
		this.accno = accno;
		this.custid = custid;
		this.branch_name = branch_name;
		this.ifsc = ifsc;
		this.savingsamount = savingsamount;
	}
	public AccountInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	}
