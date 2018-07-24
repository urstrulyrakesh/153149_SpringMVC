package com.cg.mypaymentapp.beans;

import java.math.BigDecimal;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotEmpty;

@Embeddable
public class Wallet {

	@NotEmpty
	private BigDecimal balance;

	public Wallet() {
		this.balance=null;
	}
	public Wallet(BigDecimal amount) {
		this.balance=amount;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@Override
		public String toString() {
		return ", balance="+balance;
	}

}
