package com.valtech.Account.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.Account.Entity.Customer;
import com.valtech.Account.Service.CustomerService;

@RestController
public class CustomerRestController {
	
	@Autowired
	 private CustomerService customerService;
	
	
	 @PostMapping("/api/customer")
	    public Customer createCustomer(@RequestBody Customer cus){
	        return customerService.createAccount(cus);
	    }
	 
	 @PutMapping("/api/customer")
	    public Customer updateCustomer(@RequestBody Customer cus){
	        return customerService.updateAccount(cus);
	    }
	 
	 @GetMapping("/api/customer/{id}")
	    public Customer getCustomerById(Long id){
	        return customerService.getCustomer(id);
	    }
	 
	 @GetMapping("/api/customer")
	    public List<Customer> getCustomers(){
	        return customerService.getAllAccounts();
	    }
}
