package com.cg.mypaymentapp.beans;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Customer {

	@NotEmpty
	private String name;
	
	@NotEmpty
	@Pattern(regexp="(^$|[1-9][0-9]{9})")
	@Id
	private String mobileNo;
	@Embedded
	private Wallet wallet;
	
	
	
	public Customer() {
		super();
		this.name = "";
		this.mobileNo ="";
		this.wallet = null;
	}
	public Customer(String name2, String mobileNo2, Wallet wallet2) {
		this.name=name2;
		mobileNo=mobileNo2;
		wallet=wallet2;
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	@Override
	public String toString() {
		return "Customer name=" + name + ", mobileNo=" + mobileNo
				 + wallet;
	}
	
}
