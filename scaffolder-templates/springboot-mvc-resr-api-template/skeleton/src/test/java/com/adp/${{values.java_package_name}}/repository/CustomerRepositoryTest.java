package com.adp.${{values.java_package_name}}.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.adp.${{values.java_package_name}}.ApplicationBaseTest;
import com.adp.${{values.java_package_name}}.entity.Customer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomerRepositoryTest extends ApplicationBaseTest{

	@Autowired
	CustomerRepository customerRepo;


	@Test
    public void testFindBySssn() {

	    Customer customer = customerRepo.findBySsn(12345631);
	    log.info(customer.toString());
        assertEquals(12345631, customer.getSsn());

        assertEquals("sasi01", customer.getFirstName());
    }

	@Test
    public void testFindById() {

	    Optional<Customer> customerOp = customerRepo.findById(1L);

		Customer customer = customerOp.get();

	    log.info(customer.toString());
        assertEquals(1, customer.getCustomerId());

        assertEquals("sasi01", customer.getFirstName());
    }

}
