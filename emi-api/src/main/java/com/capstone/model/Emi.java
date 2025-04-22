package com.capstone.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity	
public class Emi {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int s_no;
	private int loanaccno;
	private String loan_status;
	private float emi_amount;
	private Date upcomming_payment_date;
	private float remaining_amount;
	public int getS_no() {
		return s_no;
	}
	@Override
	public String toString() {
		return "emi [s_no=" + s_no + ", loanaccno=" + loanaccno + ", loan_status=" + loan_status + ", emi_amount="
				+ emi_amount + ", upcomming_payment_date=" + upcomming_payment_date + ", remaining_amount="
				+ remaining_amount + "]";
	}
	public void setS_no(int s_no) {
		this.s_no = s_no;
	}
	public int getLoanaccno() {
		return loanaccno;
	}
	public void setLoanaccno(int loanaccno) {
		this.loanaccno = loanaccno;
	}
	public String getLoan_status() {
		return loan_status;
	}
	public void setLoan_status(String loan_status) {
		this.loan_status = loan_status;
	}
	public float getEmi_amount() {
		return emi_amount;
	}
	public void setEmi_amount(float emi_amount) {
		this.emi_amount = emi_amount;
	}
	public Date getUpcomming_payment_date() {
		return upcomming_payment_date;
	}
	public void setUpcomming_payment_date(Date upcomming_payment_date) {
		this.upcomming_payment_date = upcomming_payment_date;
	}
	public float getRemaining_amount() {
		return remaining_amount;
	}
	public Emi(int s_no, int loanaccno, String loan_status, float emi_amount, Date upcomming_payment_date,
			float remaining_amount) {
		super();
		this.s_no = s_no;
		this.loanaccno = loanaccno;
		this.loan_status = loan_status;
		this.emi_amount = emi_amount;
		this.upcomming_payment_date = upcomming_payment_date;
		this.remaining_amount = remaining_amount;
	}
	public void setRemaining_amount(float remaining_amount) {
		this.remaining_amount = remaining_amount;
	}
	public Emi() {
		super();
		// TODO Auto-generated constructor stub
	}
}	