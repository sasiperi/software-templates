package com.adp.${{values.java_package_name}}.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adp.${{values.java_package_name}}.entity.Customer;
import com.adp.${{values.java_package_name}}.service.CustomerService;

@RestController
public class CustomerController {

	//TODO : NOT ADVICED DO CONSTURCTOR INJECTION
	@Autowired
	private CustomerService customerService;

	@GetMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable("id") Long id) {

		return customerService.getCustomerById(id);

	}

	@PatchMapping("/customer/{id}")
	public Customer updateCustomer(@PathVariable("id") Long id) {

		return customerService.updateCustomerById(id);

	}


	@GetMapping("/customer")
	public List<Customer> getAllCustomer() {

		return customerService.getAllCustomers();

	}

	@PostMapping("/customer")
	public Customer createCustomer(@RequestBody Customer customer) {

		return customerService.createCustomerById(customer);

	}


	@GetMapping("/customer/ssn/{ssn}")
	public Customer getCustomer(@PathVariable("ssn") int ssn) {

		return customerService.getCustomerBySsn(ssn);

	}

}
