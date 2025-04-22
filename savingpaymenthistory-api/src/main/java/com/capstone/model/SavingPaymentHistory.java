package com.capstone.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
public class SavingPaymentHistory {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int transaction_no;
	private int savingsaccno;
	private int custid;
	private Timestamp time_payment_atempted;
	private String payment_status;
	private int amount_debited;
	public int getTransaction_no() {
		return transaction_no;
	}
	public void setTransaction_no(int transaction_no) {
		this.transaction_no = transaction_no;
	}
	public int getSavingsaccno() {
		return savingsaccno;
	}
	public void setSavingsaccno(int savingsaccno) {
		this.savingsaccno = savingsaccno;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public Timestamp getTime_payment_atempted() {
		return time_payment_atempted;
	}
	public void setTime_payment_atempted(Timestamp time_payment_atempted) {
		this.time_payment_atempted = time_payment_atempted;
	}
	public String getPayment_status() {
		return payment_status;
	}
	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}
	public int getAmount_debited() {
		return amount_debited;
	}
	@Override
	public String toString() {
		return "SavingPaymentHistory [transaction_no=" + transaction_no + ", savingsaccno=" + savingsaccno + ", custid="
				+ custid + ", time_payment_atempted=" + time_payment_atempted + ", payment_status=" + payment_status
				+ ", amount_debited=" + amount_debited + "]";
	}
	public SavingPaymentHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SavingPaymentHistory(int transaction_no, int savingsaccno, int custid, Timestamp time_payment_atempted,
			String payment_status, int amount_debited) {
		super();
		this.transaction_no = transaction_no;
		this.savingsaccno = savingsaccno;
		this.custid = custid;
		this.time_payment_atempted = time_payment_atempted;
		this.payment_status = payment_status;
		this.amount_debited = amount_debited;
	}
	public void setAmount_debited(int amount_debited) {
		this.amount_debited = amount_debited;
	}
	
}
