package com.question3.controller;

import java.util.Date;

import com.question3.entities.Customer;
import com.question3.service.CustomerServiceImpl;
import com.question3.service.CustomerServiceInterface;

public class mainCustomerApp {

	public static void main(String[] args) {
		
		Customer customer = new Customer("DemoCustomer", "Delhi", "9992931322", new Date(2021, 9, 11));
		
		CustomerServiceInterface customerApp=new CustomerServiceImpl();
		
		customerApp.addCustomer(customer);
		
		customerApp.findCustomerById(1);
		
	}

}
