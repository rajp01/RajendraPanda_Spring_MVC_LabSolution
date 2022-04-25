package com.gl.sampleweb1.service;

import java.util.List;

import com.gl.sampleweb1.entity.Customer;


public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
	
}