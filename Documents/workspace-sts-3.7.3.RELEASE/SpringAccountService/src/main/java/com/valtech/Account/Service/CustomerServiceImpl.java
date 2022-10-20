package com.valtech.Account.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valtech.Account.Entity.Account;
import com.valtech.Account.Entity.Customer;
import com.valtech.Account.Repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	@Override
	public Customer createAccount(Customer cust) {
		return customerRepository.save(cust);
	}
	
	
	@Override
	public Customer updateAccount(Customer cust) {
		return customerRepository.save(cust);
	}
	
	
	@Override
	public Customer getCustomer(long id) {
		return customerRepository.findById(id).get();
	}
	
	
	@Override
	public List<Customer> getAllAccounts() {
		return customerRepository.findAll();
	}
	
	
}
