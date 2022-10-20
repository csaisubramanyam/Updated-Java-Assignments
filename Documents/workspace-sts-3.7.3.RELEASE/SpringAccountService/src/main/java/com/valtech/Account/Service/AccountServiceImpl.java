package com.valtech.Account.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valtech.Account.Entity.Account;
import com.valtech.Account.Repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {
	
	
	private Account account;
	
	
	@Autowired
	private AccountRepository accountRepository;
	
	
	@Override
	public Account createAccount(Account acc) {
		return accountRepository.save(acc);
	}
	
	
	@Override
	public Account updateAccount(Account acc) {
		return accountRepository.save(acc);
	}
	
	
	@Override
	public Account getAccount(long id) {
		return accountRepository.findById(id).get();
	}
	
	
	@Override
	public List<Account> getAllAccounts() {
		return accountRepository.findAll();
	}


	@Override
	public Account createSavingsAccount(double balance) {
	     account=new Account("SB",balance);
	     return accountRepository.save(account);
	}


	@Override
	public Account createCurrentAccount(double balance) {
		 account=new Account("CA",balance);
		 return accountRepository.save(account);
	}
}
