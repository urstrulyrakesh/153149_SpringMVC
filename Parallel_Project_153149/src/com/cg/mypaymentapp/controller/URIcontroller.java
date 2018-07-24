package com.cg.mypaymentapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.mypaymentapp.beans.Customer;


@Controller
public class URIcontroller {

	@RequestMapping("/")
	public String getHomePage() {
		return "index";
	}
	
	@RequestMapping("/display")
	public String getDisplayPage() {
		return "display";
	}
	
	
	@RequestMapping("/deposit")
	public String getDepositPage() {
		return "deposit";
	}
	
	@RequestMapping("/fundtransfer")
	public String getFundPage() {
		return "fundtransfer";
	}
	
	@RequestMapping("/withdraw")
	public String getWithdrawPage() {
		return "withdraw";
	}
	
	
	@RequestMapping("/createaccount")
	public String getCreateaccount() {
		return "createaccount";
	}
	
	@RequestMapping("/success")
	public String getSuccess() {
		return "success";
	}
	
	@ModelAttribute("customer")
	public Customer getCustomer() {
	return new Customer();
}
}
