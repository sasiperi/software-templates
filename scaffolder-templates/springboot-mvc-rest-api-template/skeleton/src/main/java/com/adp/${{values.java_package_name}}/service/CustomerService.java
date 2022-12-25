package com.adp.${{values.java_package_name}}.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.adp.${{values.java_package_name}}.entity.Customer;
import com.adp.${{values.java_package_name}}.repository.CustomerRepository;

@Service
public class CustomerService {

	//TOD: replace with cinstructor injection
	@Autowired
	CustomerRepository customerRepo;

	public Customer getCustomerById(Long id) {
		Optional<Customer> customerOp = customerRepo.findById(id);
		return customerOp.get();
	}

	public Customer updateCustomerById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Customer createCustomerById(Customer customer) {
		return customerRepo.save(customer);
	}

	public Customer getCustomerBySsn(int ssn) {

		return customerRepo.findBySsn(ssn);
	}

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepo.findAll(Sort.by(Direction.DESC, "customerId"));
	}

}
