package com.valtech.Account.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.Account.Entity.Account;
import com.valtech.Account.Service.AccountService;

@RestController
public class AccountRestController {
	
	
	@Autowired
	private AccountService accountService;
	
	
//	 @PostMapping("/api/account")
//	    public Account createAccount(@RequestBody Account acc){
//	        return accountService.createAccount(acc);
//	}
//	 
//	 
//	 @PostMapping("/api/account")
//	    public Account updateAccount(@RequestBody Account acc){
//	        return accountService.updateAccount(acc);
//	}
//	 
	
	@PostMapping("/api/accounts/SB/")
	public Account createSavingsAccount(@RequestParam("balance")double balance) {
		return accountService.createSavingsAccount(balance);
	}
	
	
	@PostMapping("/api/accounts/CA/")
	public Account createCurrentAccount(@RequestParam("balance")double balance) {
		return accountService.createCurrentAccount(balance);
	}
	
}
