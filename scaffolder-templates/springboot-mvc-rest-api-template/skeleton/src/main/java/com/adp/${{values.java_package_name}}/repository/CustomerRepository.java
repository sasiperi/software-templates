package com.adp.${{values.java_package_name}}.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.adp.${{values.java_package_name}}.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {


	Customer findBySsn(@Param("ssn") int ssn);



}
