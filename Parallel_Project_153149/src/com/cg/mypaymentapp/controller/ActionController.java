package com.cg.mypaymentapp.controller;

import java.math.BigDecimal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.mypaymentapp.beans.Customer;
import com.cg.mypaymentapp.service.WalletService;



@Controller
public class ActionController {

	@Autowired(required=true)
	private WalletService walletservices;
	
	@RequestMapping(value="/createAcc",method=RequestMethod.POST)
	public ModelAndView registerFaculty(@Valid @ModelAttribute("customer") Customer customer, BindingResult res) {
	
		if(res.hasErrors()) return new ModelAndView("createaccount");
			customer =walletservices.createAccount(customer.getName(),customer.getMobileNo(),customer.getWallet().getBalance());
			ModelAndView modelAndView = new ModelAndView("success", "customer", customer);
			return modelAndView;
	}
	
	@RequestMapping(value="/displayacc",method=RequestMethod.GET)
	public ModelAndView display1(@ModelAttribute("customer") Customer customer) {
	
			customer =walletservices.showBalance(customer.getMobileNo());
			ModelAndView modelAndView = new ModelAndView("showbalance", "customer", customer);
			return modelAndView;
	}
	
	@RequestMapping(value="/depositamt",method=RequestMethod.GET)
	public ModelAndView display2(@ModelAttribute("customer") Customer customer) {
	
			customer =walletservices.depositAmount(customer.getMobileNo(),customer.getWallet().getBalance());
			ModelAndView modelAndView = new ModelAndView("showbalance", "customer", customer);
			return modelAndView;
	}
	
	@RequestMapping(value="/withdrawamt",method=RequestMethod.GET)
	public ModelAndView display3(@ModelAttribute("customer") Customer customer) {
	
			customer =walletservices.withdrawAmount(customer.getMobileNo(),customer.getWallet().getBalance());
			ModelAndView modelAndView = new ModelAndView("showbalance", "customer", customer);
			return modelAndView;
	}
	
	
	@RequestMapping(value="/fundtrans",method=RequestMethod.GET)
	public ModelAndView display4(@RequestParam("mno") String mno, @RequestParam("mno1") String mno1, @RequestParam("bal") BigDecimal bal) {
	
			Customer customer =walletservices.fundTransfer(mno,mno1,bal);
			ModelAndView modelAndView = new ModelAndView("showbalance", "customer", customer);
			return modelAndView;
	}
	
}
