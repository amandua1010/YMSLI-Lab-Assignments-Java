package com.question3.service;

import com.question3.entities.Customer;
import com.question3.exceptions.CusotmerNotFoundException;
import com.question3.exceptions.DAOExceptions;

public interface CustomerServiceInterface {
	
	public Customer addCustomer(Customer customer) throws DAOExceptions;
	
	public Customer findCustomerById(int id) throws CusotmerNotFoundException;
	
}
