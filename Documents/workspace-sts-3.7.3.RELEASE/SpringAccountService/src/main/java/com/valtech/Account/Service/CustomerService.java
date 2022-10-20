package com.valtech.Account.Service;

import java.util.List;

import com.valtech.Account.Entity.Customer;

public interface CustomerService {

	Customer createAccount(Customer cust);

	Customer updateAccount(Customer cust);

	Customer getCustomer(long id);

	List<Customer> getAllAccounts();



}