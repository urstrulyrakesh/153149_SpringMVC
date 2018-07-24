package com.cg.mypaymentapp.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.mypaymentapp.beans.Customer;


public interface WalletService {
	
	public Customer createAccount(String name ,String mobileno, BigDecimal amount);
	public Customer showBalance (String mobileno);
	public Customer fundTransfer (String sourceMobileNo,String targetMobileNo, BigDecimal amount);
	public Customer depositAmount (String mobileNo,BigDecimal amount );
	public Customer withdrawAmount(String mobileNo, BigDecimal amount);
	boolean validatePhone(String str);

}
