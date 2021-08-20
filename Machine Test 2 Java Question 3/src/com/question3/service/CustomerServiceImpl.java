package com.question3.service;

import com.question3.dao.CustomerDao;
import com.question3.dao.CustomerDaoImpl;
import com.question3.entities.Customer;
import com.question3.exceptions.CusotmerNotFoundException;
import com.question3.exceptions.DAOExceptions;


public class CustomerServiceImpl implements CustomerServiceInterface {
	
	private CustomerDao customerDao;
	
	public CustomerServiceImpl() {
		customerDao = new CustomerDaoImpl();
	}
	
	@Override
	public Customer addCustomer(Customer customer) throws DAOExceptions {
		return customerDao.addCustomer(customer);
	}

	@Override
	public Customer findCustomerById(int id) throws CusotmerNotFoundException {
		return customerDao.findCustomerById(id);
	}
	
}
