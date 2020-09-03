package com.in10se.poc.repository;

import com.in10se.poc.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
